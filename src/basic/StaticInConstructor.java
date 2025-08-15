//constructor initializing static variable
package basic;

public class StaticInConstructor {
    static int count = 0;

    public StaticInConstructor(){
        count++;
        System.out.println("Constructor executed. count = " + count);
    }
    public static void main(String[] args){
        new StaticInConstructor();
        new StaticInConstructor();
        new StaticInConstructor();
    }
}
