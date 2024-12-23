public class MethodsEx02 {

    public static void main(String[] args){

        System.out.println("Main Begins");
        fun1();
        System.out.println("Main Ends");
    }

    public static void fun1(){

        System.out.println("fun1 method begins");
        fun2();
        System.out.println("fun1 method ends");
    }

    public static void fun2(){

        System.out.println("Inside fun2 method.");

    }
}
