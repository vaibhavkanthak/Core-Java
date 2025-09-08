package basic;
import java.io.Console;
import java.util.Arrays;
public class SecurePasswordDemo {
        public static void main(String [] args){

            Console cons = System.console();
            if (cons == null) {
                System.out.println("No console available. Please run this program in a terminal.");
                return;
            }
            // Ask for username
            String username = cons.readLine("User name: ");

            // Ask for password (hidden input)
            char[] passwd = cons.readPassword("Password: ");

            // Simulate authentication (normally you’d hash & compare with stored password)
            if ("admin".equals(username) && Arrays.equals(passwd, "secret".toCharArray())) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password.");
            }

            // Overwrite password in memory for security
            Arrays.fill(passwd, '*');
        }
}
