//Print multiplication table of a given number
package practice;
import java.util.Scanner;
public class Practice23 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();

            for(int i = 1; i <= 10; i++){
                System.out.println(num + " x " + i + " = " + num * i);
            }
            sc.close();
        }
}
