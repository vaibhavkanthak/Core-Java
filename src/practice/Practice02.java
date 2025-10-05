//Swap two numbers using a temporary variable
package practice;

public class Practice02 {
        public static void main(String[] args){
            int a = 10, b = 20;
            int temp;

            temp = b;
            b = a;
            a = temp;

            System.out.println("After swap: a = "+ a + " b = " + b);
        }
}
