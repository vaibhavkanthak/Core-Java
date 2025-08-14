//Java program to show scope of instance and static variables
package basic;
public class ScopeOfVariables {
    static int x = 22;
    private int y = 33;
    public void method1(int x)
    {
        ScopeOfVariables t = new ScopeOfVariables();
        this.x = 22;
        y = 44;

        System.out.println("ScopeOfVariables.x: " + this.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[]) {
        ScopeOfVariables t = new ScopeOfVariables();
        t.method1(5);
    }
}
