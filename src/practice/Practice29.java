//Check whether a number is an Armstrong number
package practice;
import java.util.Scanner;
public class Practice29 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int temp = num, sum = 0;

            while(temp != 0){
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if(sum == num){
                System.out.println(" Its a armstrong number");
            }else{
                System.out.println("Its not a armstrong number");
            }
            sc.close();
        }
}
