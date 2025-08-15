//java program to access static variable from class name.
package basic;

public class ScopeOfVariables02 {

        static int counter = 0;
        int id;

        ScopeOfVariables02(){
            counter++;
            id = counter;
        }
    public static void main(String[] args){

        ScopeOfVariables02 a = new ScopeOfVariables02();
        ScopeOfVariables02 b = new ScopeOfVariables02();
        ScopeOfVariables02 c = new ScopeOfVariables02();

        System.out.println("Total objects created: " + ScopeOfVariables02.counter);
        System.out.println("a.id: " + a.id);
        System.out.println("b.id: " + b.id);
        System.out.println("c.id: " + c.id);


    }
}
