//java program on instance block example
package basic;

public class InstanceBlockExample {
    int y;
    {
        y = 20;
        System.out.println("Instance block executed: y = " + y);
    }
    public InstanceBlockExample(){
        System.out.println("Constructor executed: y = " + y);
    }

    public static void main(String[] args){
        new InstanceBlockExample();
        new InstanceBlockExample();
    }
}
