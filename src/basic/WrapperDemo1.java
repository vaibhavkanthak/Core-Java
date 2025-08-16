//Autoboxing and unboxing
package basic;

public class WrapperDemo1 {
        public static void main(String[] args){
            //Autoboxing: primitive -> wrapper
            int a = 10;
            Integer obj = a;
            System.out.println("Autoboxed Integer: " + obj);

            //Unboxing: wrapper -> primitive
            Integer b = 20;
            int val = b;
            System.out.println("Unboxed int: " + val);

        }
}
