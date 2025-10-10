//Calculate BMI (Body Mass Index)
package practice;
import java.util.Scanner;
public class Practice57 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter weight (kg): ");
            double weight = sc.nextDouble();
            System.out.println("Enter height (m): ");
            double height = sc.nextDouble();

            double bmi = weight / (height * height);
            System.out.println("BMI = " + bmi);
        }
}
