//Calculate total marks and percentage using arithmetic operators
package practice;
import java.util.Scanner;
public class Practice64 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter marks of 5 subjects: ");
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            int s4 = sc.nextInt();
            int s5 = sc.nextInt();

            int total = s1 + s2 + s3 + s4 + s5;
            double percent = (total / 500.0) * 100;
            System.out.println("Total = " + total);
            System.out.println("Percentage = " + percent + "%");
        }
}
