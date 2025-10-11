//Check if a string is a palindrome
package practice;
import java.util.Scanner;
public class Practice72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}