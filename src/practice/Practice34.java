//Check whether a number is prime or not
package practice;
import java.util.Scanner;
public class Practice34 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number: ");
            int num = sc.nextInt();

            boolean isPrime = true;
            if(num <= 1) isPrime = false;

            for(int i = 2; i <= num / 2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num + " is a Prime number.");
            }else{
                System.out.println(num + " is not a Prime number");
            }
            sc.close();
        }
}
