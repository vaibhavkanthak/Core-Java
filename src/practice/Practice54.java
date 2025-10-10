//Calculate power of a number (without Math.pow)
package practice;
import java.util.Scanner;
public class Practice54 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter base number: ");
            int base = sc.nextInt();
            System.out.println("Enter exponent: ");
            int exp = sc.nextInt();
            int result = 1;
            for(int i = 1; i <= exp; i++){
                result *= base;
            }
            System.out.println(base + "^" + exp + " = " + result);
        }
}
