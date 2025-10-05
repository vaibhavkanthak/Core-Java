//Demonstrate pre-increment and post-increment operators
package practice;

public class Practice11 {
        public static void main(String[] args){
            int x = 5;

            System.out.println("x = " + x);
            System.out.println("Pre-increment: " + (++x));
            System.out.println("After pre-increment, x = " + x);

            System.out.println("Post-increment: " + (x++));
            System.out.println("After post-increment, x = " + x);

        }
}
