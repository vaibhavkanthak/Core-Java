//java program on static block example.
package basic;
public class StaticBlockExample {

    static int x;

    static{
        x = 10;
        System.out.println("Static block executed: " + x);

    }

    public static void main(String[] args){

        System.out.println("Main method executed: " + x);
    }
}
