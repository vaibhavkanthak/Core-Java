package basic;

public class JavaStringBuilderMethods {
    public static void main(String[] args) {
        // Example 1: Using String (inefficient in loops)
        String str = "";
        long start1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            str += "a"; // creates a new String object each time
        }
        long end1 = System.nanoTime();
        System.out.println("String length: " + str.length());
        System.out.println("Time with String concatenation: " + (end1 - start1) + " ns");

        // Example 2: Using StringBuilder (efficient)
        StringBuilder builder = new StringBuilder();
        long start2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            builder.append("a"); // appends to the same object
        }
        String result = builder.toString();
        long end2 = System.nanoTime();
        System.out.println("StringBuilder length: " + result.length());
        System.out.println("Time with StringBuilder: " + (end2 - start2) + " ns");

        // Appending characters and strings
        StringBuilder build = new StringBuilder();
        build.append('H');
        build.append("ello");
        build.append(' ');
        build.append("World!");

        //Converting back to string
        String completedString = build.toString();

        System.out.println("Final String: " + completedString);
    }
}