//Calculate total salary with HRA & DA
package practice;
import java.util.Scanner;
public class Practice59 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter basic salary: ");
            double basic = sc.nextDouble();

            double hra = 0.2 * basic;
            double da = 0.1 * basic;
            double total = basic + hra + da;
            System.out.println("Total Salary = " + total);
        }
}
