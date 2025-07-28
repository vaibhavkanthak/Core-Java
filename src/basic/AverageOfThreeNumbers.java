package basic;
import java.util.Scanner;
public class AverageOfThreeNumbers {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter second number: ");
            int num2 = input.nextInt();
            System.out.println("Enter third number: ");
            int num3 = input.nextInt();

            System.out.println("Average of three numbers: " + (num1 + num2 + num3) / 3);

        }
}
