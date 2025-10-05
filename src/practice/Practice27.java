//Reverse a given number
package practice;
import java.util.Scanner;
public class Practice27 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();

            int rev = 0;
            while(num != 0){
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }
            System.out.println("Reversed number: " + rev);
            sc.close();
        }
}
