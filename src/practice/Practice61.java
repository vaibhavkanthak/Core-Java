//Convert decimal to binary manually
package practice;
import java.util.Scanner;
public class Practice61 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter decimal number: ");
            int num = sc.nextInt();
            String binary = "";
            while(num > 0){
                int rem = num % 2;
                binary += rem;
                num /= 2;
            }
            System.out.println("Binary = " + binary);

        }
}
