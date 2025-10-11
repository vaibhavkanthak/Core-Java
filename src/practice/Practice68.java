//Check if a number is an Armstrong number
package practice;
import java.util.Scanner;
public class Practice68 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            int temp = num, sum = 0;
            while(num > 0){
               int digit = num % 10;
               sum += digit * digit * digit;
               num /= 10;
            }
            if(sum == temp){
                System.out.println("Given number is armstrong number");
            }else {
                System.out.println("Given number is not armstrong number");
            }

        }
}
