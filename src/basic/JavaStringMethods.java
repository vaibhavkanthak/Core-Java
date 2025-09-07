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


        }
}
