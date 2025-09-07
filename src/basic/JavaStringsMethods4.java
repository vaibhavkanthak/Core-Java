package basic;

public class JavaStringsMethods4 {
    public static void main(String[] args) {
        String text = "Java is fun. Java is powerful. Java is everywhere.";

        // 1. Replace all occurrences of "Java" with "Python"
        String replaced1 = text.replace("Java", "Python");
        System.out.println("Original: " + text);
        System.out.println("replace(\"Java\", \"Python\"): " + replaced1);

        // 2. Replace a smaller substring
        String replaced2 = text.replace("fun", "awesome");
        System.out.println("\nreplace(\"fun\", \"awesome\"): " + replaced2);

        // 3. Replace with empty string (removal)
        String replaced3 = text.replace("powerful", "");
        System.out.println("\nreplace(\"powerful\", \"\"): " + replaced3);

        // 4. Using StringBuilder as replacement
        StringBuilder sb = new StringBuilder("C++");
        String replaced4 = text.replace("Java", sb);
        System.out.println("\nreplace(\"Java\", StringBuilder(\"C++\")): " + replaced4);

        // 5. Case-sensitive behavior
        String caseSensitive = text.replace("java", "Kotlin");
        System.out.println("\nCase-sensitive replace(\"java\", \"Kotlin\"): " + caseSensitive);
    }
}