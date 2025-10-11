//Count number of digits in a number
package practice;
import java.util.Scanner;
public class Practice67 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            int count = 0;
            while(num > 0){
                num /= 10;
                count++;
            }
            System.out.println("Number of digits = " + count);
        }
}
