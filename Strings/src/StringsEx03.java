//Find one extra letter from second string.
import java.util.Scanner;

public class StringsEx03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the two strings
        System.out.println("Enter the first string (s1):");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string (s2):");
        String s2 = sc.nextLine();

        // Ensure s2 is exactly one character longer than s1
        if (s2.length() != s1.length() + 1) {
            System.out.println("Invalid input. The second string must be exactly one character longer than the first.");
        } else {
            // Find and display the extra character
            char extraChar = findExtra(s1, s2);
            System.out.println("The extra character is: " + extraChar);
        }

        sc.close();
    }

    // Method to find the extra character
    public static char findExtra(String s1, String s2) {
        int[] count = new int[26]; // Array to count letter frequencies

        int n = s1.length();

        // Decrement counts for characters in s1 and increment for characters in s2
        for (int i = 0; i < n; i++) {
            count[s1.charAt(i) - 'a']--;
            count[s2.charAt(i) - 'a']++;
        }

        // Increment count for the last character in s2
        count[s2.charAt(n) - 'a']++;

        // Find the character with a count of 1
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                return (char) (i + 'a'); // Convert index back to character
            }
        }

        return 0; // Default return (shouldn't be reached in valid inputs)
    }
}