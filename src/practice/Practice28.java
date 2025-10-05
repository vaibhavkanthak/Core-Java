//Check whether a number is a palindrome
package practice;
import java.util.Scanner;
public class Practice28 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int original = num, rev = 0;

            while(num != 0){
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }
            if(rev == original){
                System.out.println("It's palindrome number");
            }else{
                System.out.println("It's not a palindrome");
            }
        }
}
