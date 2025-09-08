package basic;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class SecurePasswordDemo2 {
        public static void main(String[] args){
            //1. Scanner demo
            Scanner in = new Scanner(System.in);

            //nextLine()
            System.out.println("Enter a full sentence: ");
            String line = in.nextLine();
            System.out.println("You entered (nextLine): " + line);

            // next()
            System.out.print("Enter a word: ");
            String word = in.next();
            System.out.println("You entered (next): " + word);

            // nextInt()
            System.out.print("Enter an integer: ");
            int number = in.nextInt();
            System.out.println("You entered (nextInt): " + number);

            // nextDouble()
            System.out.print("Enter a decimal number: ");
            double decimal = in.nextDouble();
            System.out.println("You entered (nextDouble): " + decimal);
            // hasNext, hasNextInt, hasNextDouble
            System.out.print("Enter some text to test hasNext methods: ");

            if (in.hasNext()) {
                System.out.println("Scanner has more input.");
            }
            if (in.hasNextInt()) {
                System.out.println("Next token is an integer: " + in.nextInt());
            } else if (in.hasNextDouble()) {
                System.out.println("Next token is a double: " + in.nextDouble());
            } else {
                System.out.println("Next token is a string: " + in.next());
            }

            //Close scanner
            in.close();

            // 2. System.console() demo
            Console cons = System.console();
            if (cons != null) {
                String username = cons.readLine("User name: ");
                char[] passwd = cons.readPassword("Password: ");

                // Fake check
                if ("admin".equals(username) && Arrays.equals(passwd, "secret".toCharArray())) {
                    cons.printf("Login successful!\n");
                } else {
                    cons.printf("Invalid login!\n");
                }

                // Clear password
                Arrays.fill(passwd, '*');
            } else {
                System.out.println("No console available. Run in terminal for Console demo.");


        }
}
