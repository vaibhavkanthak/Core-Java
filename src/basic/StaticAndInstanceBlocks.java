//Java program on static and instance block execution.
package basic;

public class StaticAndInstanceBlocks {
    static int x;
    int y;

    static{
        x = 5;
        System.out.println("Static block executed: x = " + x);
    }
    {
        y = 15;
        System.out.println("Instance block executed: y = " + y);

    }
    public StaticAndInstanceBlocks(){
        System.out.println("Constructor executed: x = " + x + ", y = " + y);
    }
    public static void main(String[] args){
        new StaticAndInstanceBlocks();
        new StaticAndInstanceBlocks();
    }
}
