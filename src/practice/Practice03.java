//Swap two numbers without using a third variable
package practice;

public class Practice03 {
        public static void main(String[] args){
            int a = 10, b = 20;

            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After Swap: a = " + a + ", b = " + b);
        }
}
