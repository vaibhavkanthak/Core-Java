package basic;

public class JavaStringsMethods6 {
    public static void main(String[] args) {
        // ----- strip(), stripLeading(), stripTrailing() -----
        String text = "   \t  Hello World!   \n  ";
        System.out.println("Original with spaces: [" + text + "]");

        System.out.println("strip(): [" + text.strip() + "]");
        System.out.println("stripLeading(): [" + text.stripLeading() + "]");
        System.out.println("stripTrailing(): [" + text.stripTrailing() + "]");

        // ----- join() -----
        String joined = String.join(" | ", "Java", "Python", "C++", "Go");
        System.out.println("\nString.join() example:");
        System.out.println("Joined: " + joined);

        // ----- repeat() -----
        String repeated = "Ha".repeat(5);
        System.out.println("\nrepeat() example:");
        System.out.println("\"Ha\" repeated 5 times: " + repeated);

        // Edge case: repeat(0) gives empty string
        String emptyRepeat = "Hi".repeat(0);
        System.out.println("repeat(0): [" + emptyRepeat + "]");

        //-----trim()-----
        System.out.println(text.trim());
    }
}