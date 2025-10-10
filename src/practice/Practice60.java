//Convert binary to decimal manually
package practice;
import java.util.Scanner;
public class Practice60 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter binary number: ");
            int binary = sc.nextInt();
            int decimal = 0, base = 1;
            while(binary > 0){
                int lastDigit = binary % 10;
                decimal += lastDigit * base;
                base *= 2;
                binary /= 10;
            }
            System.out.println("Decimal = " + decimal);
        }
}
