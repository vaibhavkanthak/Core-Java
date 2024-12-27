public class MethodsEx01 {
    public static void main(String[] args) {

        System.out.println("Before method call");

        fun();
        fun();

        System.out.println("After method call");
    }

    public static void fun(){

        System.out.println("Inside method fun()");

    }
}