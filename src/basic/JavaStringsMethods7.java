package basic;

import java.util.Arrays;

public class JavaStringsMethods7 {
    public static void main(String[] args) {
        // ----- concat() -----
        String str1 = "Hello";
        String str2 = " World";
        String result1 = str1.concat(str2);
        String result2 = str1 + str2; // equivalent using +

        System.out.println("----- concat() -----");
        System.out.println("Using concat(): " + result1);
        System.out.println("Using + operator: " + result2);

        // ----- split() -----
        String text = "Java,Python,C++,Go,JavaScript";
        String[] parts = text.split(","); // split on comma
        String[] limitParts = text.split(",", 3); // split into max 3 parts

        System.out.println("\n----- split() -----");
        System.out.println("Original: " + text);
        System.out.println("split(\",\"): " + Arrays.toString(parts));
        System.out.println("split(\",\", 3): " + Arrays.toString(limitParts));

        // ----- equals() vs == -----
        String a = "Java"; // string literal
        String b = "Java"; // refers to same object in String pool
        String c = new String("Java"); // explicitly creates new object

        System.out.println("\n----- equals() vs == -----");
        System.out.println("a == b: " + (a == b));           // true (same pool object)
        System.out.println("a.equals(b): " + a.equals(b));   // true (same content)

        System.out.println("a == c: " + (a == c));           // false (different objects)
        System.out.println("a.equals(c): " + a.equals(c));   // true (same content)

        // proof that == checks references
        System.out.println("\nReference check:");
        System.out.println("System.identityHashCode(a): " + System.identityHashCode(a));
        System.out.println("System.identityHashCode(b): " + System.identityHashCode(b));
        System.out.println("System.identityHashCode(c): " + System.identityHashCode(c));
    }
}