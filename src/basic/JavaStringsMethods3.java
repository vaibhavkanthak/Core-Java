package basic;

public class JavaStringsMethods3 {
    public static void main(String[] args) {
        String text = "This is a simple string example.";
        String withEmoji = "Hello \uD83C\uDF1F"; // "Hello 🌟" (emoji is supplementary)

        // length() example
        System.out.println("----- length() examples -----");
        System.out.println("Text: \"" + text + "\"");
        System.out.println("length(): " + text.length());

        System.out.println("\nWith emoji: \"" + withEmoji + "\"");
        System.out.println("length(): " + withEmoji.length() + " (UTF-16 code units)");

        // codePointCount() example
        System.out.println("\n----- codePointCount() examples -----");
        int countText = text.codePointCount(0, text.length());
        System.out.println("codePointCount(0, text.length()): " + countText);

        int countEmoji = withEmoji.codePointCount(0, withEmoji.length());
        System.out.println("codePointCount(0, withEmoji.length()): " + countEmoji + " (counts actual Unicode characters)");

        // smaller ranges
        System.out.println("\nSubstring counts:");
        System.out.println("codePointCount(0, 4) in text: " + text.codePointCount(0, 4));
        System.out.println("Substring: \"" + text.substring(0, 4) + "\"");
    }
}