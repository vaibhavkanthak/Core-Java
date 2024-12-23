import java.util.Scanner;

// Count the digits of a given number
public class LoopsEx08 {

    public static void main(String[] args) {

        System.out.println("Enter a number to count its digits:");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        // Handle zero specifically
        if (number == 0) {
            System.out.println("The number has 1 digit.");
        } else {
            // Consider the absolute value for negative numbers
            number = Math.abs(number);
            byte count = 0;

            // Count digits using a loop
            while (number > 0) {
                number /= 10; // Reduce number by one digit
                count++;
            }

            System.out.println("The number of digits is: " + count);
        }
    }
}