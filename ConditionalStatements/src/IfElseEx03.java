/* Decide if any input number is
1. Positive Even
2.Positive Odd
3.Negative Even
4.Negative Odd
5.Zero
 */
import java.util.Scanner;
public class IfElseEx03 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a natural number");
        int n = sc.nextInt();

        if(n > 0){

            if(n % 2 == 0){
                System.out.println("Given number is Positive even");
            }
            else{
                System.out.println("Given number is Positive odd");
            }
        }
        else if(n < 0){

            if(n % 2 == 0){
                System.out.println("Given number is Negative even");
            }
            else{
                System.out.println("Given number is Negative odd");
            }

        }
        else{
            System.out.println("Given number is zero");
        }
    }

}
