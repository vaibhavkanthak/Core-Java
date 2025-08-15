//mega program that puts static variables, instance variables, static block, instance block, and constructors together.
package basic;

public class MegaScopeDemo {
    //static variable shared by all objects
    static int staticCount;
    //instance variable (separate for each object)
    int instanceId;

    //Static block - runs once when class is loaded
    static{
        staticCount = 100;
        System.out.println("1. Static block executed. staticCount = " + staticCount);
    }

    //Instance block - runs every time an object is created, before constructor.
    {
        instanceId = ++staticCount;
        System.out.println("2. Instance block executed -> staticCount = " + staticCount + ", instanceId = " + instanceId);
    }

    //Constructor - runs after instance block
    public MegaScopeDemo(){
        System.out.println("3. Constructor executed -> staticCount = " + staticCount + ", instanceId = " + instanceId);
    }

    //Method to show both variables
    public void showValues(String objectName){
        System.out.println("4. " + objectName + " -> staticCount = " + staticCount + ", instanceId = " + instanceId);
    }

    public static void main(String[] args){
        System.out.println("----Program Starts----");

        //First Object
        MegaScopeDemo obj1 = new MegaScopeDemo();
        obj1.showValues("obj1");

        //Second object
        MegaScopeDemo obj2 = new MegaScopeDemo();
        obj2.showValues("obj2");

        //Third object
        MegaScopeDemo obj3 = new MegaScopeDemo();
        obj3.showValues("obj3");

        System.out.println("----Program Ends----");
    }
}
