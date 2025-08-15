//java program shadowing static variable inside method.
package basic;

public class ScopeOfVariables03 {

    static int x = 50;

    public void test(){
        int x = 90;
        System.out.println("Local x: " + x);
        System.out.println("static x: " + ScopeOfVariables03.x);
    }

    public static void main(String[] args){

        ScopeOfVariables03 obj = new ScopeOfVariables03();
        obj.test();
    }

}
