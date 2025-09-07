package basic;

import java.util.Arrays;

public class JavaStringMethods {
        public static void main(String[] args){

            String text = "This is a example of String.";
            //method 1
            char ch = text.charAt(10);
            System.out.println(ch);

            //method 2
            int codePoint = text.codePointAt(10);
            System.out.println(codePoint);
            System.out.println(Integer.toHexString(codePoint));

            //method 3
            // move 2 code points ahead starting from index 8
            int cpCount = text.offsetByCodePoints(8, 2);
            System.out.println(cpCount);

            //method 4
            String str1 = "Apple";
            String str2 = "Orange";
            String str3 = "Apple";
            System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
            System.out.println("str2.compareTo(str1): " + str2.compareTo(str1));
            System.out.println("str1.compareTo(str3):" + str1.compareTo(str3));

            //method 5 codePoints -> IntStream
            int[] codePointsArray = text.codePoints().toArray();
            System.out.println("\ncodePoints() example:");
            System.out.println("Code points array: " + Arrays.toString(codePointsArray));

            for(int cp : codePointsArray){
                System.out.println("U+" + Integer.toHexString(cp).toUpperCase() +
                        " -> " + new String(Character.toChars(cp)));
            }
            // method 6: new String(int[] codePoints, int offset, int count)
            String reconstructed = new String(codePointsArray, 0, codePointsArray.length);
            System.out.println("\nReconstructed string from codePoints array: " + reconstructed);

            // partial reconstruction (just first 4 code points: "This")
            String partial = new String(codePointsArray, 0, 4);
            System.out.println("Partial reconstruction (first 4 code points): " + partial);

            // method 7: isEmpty()
            String emptyStr = "";
            String nonEmptyStr = "Hello";
            String spaceStr = " ";

            System.out.println("\nisEmpty() examples:");
            System.out.println("\"\".isEmpty(): " + emptyStr.isEmpty()); // true
            System.out.println("\"Hello\".isEmpty(): " + nonEmptyStr.isEmpty()); // false
            System.out.println("\" \".isEmpty(): " + " ".isEmpty()); // false (space is not empty)

            // method 8: isBlank() (Java 11+)
            System.out.println("\nisBlank() examples:");
            System.out.println("\"\".isBlank(): " + emptyStr.isBlank()); // true
            System.out.println("\"Hello\".isBlank(): " + nonEmptyStr.isBlank()); // false
            System.out.println("\" \".isBlank(): " + spaceStr.isBlank()); // true (different from isEmpty)
            System.out.println("\"   \\t   \".isBlank(): " + "   \t   ".isBlank()); // true (whitespace only)

            // method 9: equals() and equalsIgnoreCase()
            String a = "Java";
            String b = "java";
            String c = "JAVA";

            System.out.println("\nequals() and equalsIgnoreCase() examples:");
            System.out.println("a.equals(b): " + a.equals(b)); // false (case-sensitive)
            System.out.println("a.equals(c): " + a.equals(c)); // false
            System.out.println("a.equalsIgnoreCase(b): " + a.equalsIgnoreCase(b)); // true
            System.out.println("a.equalsIgnoreCase(c): " + a.equalsIgnoreCase(c)); // true

            // method 10: startsWith() and endsWith()
            System.out.println("\nstartsWith() and endsWith() examples:");
            System.out.println("text.startsWith(\"This\"): " + text.startsWith("This")); // true
            System.out.println("text.startsWith(\"this\"): " + text.startsWith("this")); // false (case-sensitive)
            System.out.println("text.endsWith(\"String.\"): " + text.endsWith("String.")); // true
            System.out.println("text.endsWith(\"string.\"): " + text.endsWith("string.")); // false

        }
}
