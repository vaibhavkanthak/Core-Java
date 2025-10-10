//Check if a number is divisible by both 3 and 5
package practice;
import java.util.Scanner;
public class Practice65 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println(n + " is divisible by both 3 and 5");
            else
                System.out.println(n + " is not divisible by both 3 and 5");

        }
}
