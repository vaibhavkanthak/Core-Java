import java.util.Scanner;

// Check if a number is prime
public class LoopsEx20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            int count = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        sc.close();
    }
}