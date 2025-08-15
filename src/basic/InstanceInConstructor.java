//constructor initializing instance variable
package basic;

public class InstanceInConstructor {
    int id;

    public InstanceInConstructor(int id){
        this.id = id;
        System.out.println("Constructor executed. id = " + this.id);
    }

    public static void main(String[] args){
        new InstanceInConstructor(101);
        new InstanceInConstructor(102);
    }
}
