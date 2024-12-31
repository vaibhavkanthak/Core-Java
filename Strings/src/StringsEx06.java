import java.util.Scanner;

public class StringsEx06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string from the user
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = sc.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        sc.close();
    }

    public static boolean checkPalindrome(String str) {
        // Convert to lowercase to make the check case-insensitive
        str = str.toLowerCase();

        // Initialize two pointers
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            // Ignore non-alphanumeric characters
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
                continue;
            }

            // Compare characters
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found
            }

            // Move the pointers inward
            left++;
            right--;
        }

        return true; // All characters matched
    }
}