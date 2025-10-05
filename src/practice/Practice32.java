//Find greatest and smallest among N numbers using loop
package practice;
import java.util.Scanner;
public class Practice32 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number count: ");
            int n = sc.nextInt();

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                int num = sc.nextInt();
                if (num > max) max = num;
                if (num < min) min = num;
            }

            System.out.println("Maximum = " + max);
            System.out.println("Minimum = " + min);
            sc.close();
        }
}
