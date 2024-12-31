import java.util.Scanner;

public class StringsEx04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();

        // Check lengths
        if (s1.length() != s2.length()) {
            System.out.println("Given two strings are not the same length, so they cannot be anagrams.");
        } else {
            // Call the isAnagram method
            boolean result = isAnagram(s1, s2);

            // Print the result
            if (result) {
                System.out.println("The two strings are anagrams.");
            } else {
                System.out.println("The two strings are not anagrams.");
            }
        }

        sc.close();
    }

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {
        // Create a frequency array for characters
        int[] count = new int[26];

        // Count frequencies for both strings
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++; // Increment for s1
            count[s2.charAt(i) - 'a']--; // Decrement for s2
        }

        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false; // Mismatch found
            }
        }

        return true; // Strings are anagrams
    }
}