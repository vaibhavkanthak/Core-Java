//static block + constructor
package basic;

public class StaticBlockAndConstructor {
    static int x;
    static{
        x = 100;
        System.out.println("Static block executed. x = " + x);
    }
    public StaticBlockAndConstructor(){
        x += 10;
        System.out.println("Constructor executed. x = " + x);
    }
    public static void main(String[] args){
        new StaticBlockAndConstructor();
        new StaticBlockAndConstructor();
    }
}
