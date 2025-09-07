package basic;

public class JavaStringsMethods5 {
    public static void main(String[] args) {
        String text = "Java Programming is Powerful!";

        // Original string
        System.out.println("Original: " + text);

        // 1. Convert to lowercase
        String lower = text.toLowerCase();
        System.out.println("toLowerCase(): " + lower);

        // 2. Convert to uppercase
        String upper = text.toUpperCase();
        System.out.println("toUpperCase(): " + upper);

        // 3. Show that original string is unchanged
        System.out.println("Original after conversions: " + text);

        // 4. With special characters
        String special = "Straße"; // German word with ß
        System.out.println("\nSpecial case:");
        System.out.println("Original: " + special);
        System.out.println("toUpperCase(): " + special.toUpperCase()); // STRASSE
        System.out.println("toLowerCase(): " + special.toLowerCase()); // straße
    }
}