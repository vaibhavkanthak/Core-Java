//Check if number is positive, negative, or zero
package practice;
import java.util.Scanner;
public class Practice18 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if(num > 0){
                System.out.println("Positive number");
            }else if(num < 0){
                System.out.println("Negative number");
            }else{
                System.out.println("Zero");
            }
        }
}
