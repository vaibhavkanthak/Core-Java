//Demonstrate assignment and arithmetic operators
package practice;
public class Practice19 {
        public static void main(String[] args){
            int x = 10;
            System.out.println("Initial x = " + x);

            x += 5;
            System.out.println("After += 5, x = " + x);

            x -= 3;
            System.out.println("After -= 3, x = " + x);

            x *= 2;
            System.out.println("After *= 2, x = " + x);

            x /= 4;
            System.out.println("After /= 4, x = " + x);

            x %= 3;
            System.out.println("After %= 3, x = " + x);
        }
}
