package basic;

public class UnicodeCodePointDemo {

            public static void main(String[] args){

                String sentence = "😊 is the set of octonions.";

                // 1. String length (counts code units, not characters)
                System.out.println("sentence length (code units): " + sentence.length());
                System.out.println("sentence length (code points): " + sentence.codePointCount(0, sentence.length()));

                // 2. Problem with charAt()
                char ch1 = sentence.charAt(0);
                char ch2 = sentence.charAt(1);
                System.out.println("charAt(0): " + ch1);
                System.out.println("charAt(1): " + ch2 + "  <-- NOT a space, but a surrogate half!");
                System.out.println();

                int cp0 = sentence.codePointAt(0);   // first code point (𝕆)
                int cp1 = sentence.codePointAt(sentence.offsetByCodePoints(0, 1)); // second code point (space)
                System.out.println(cp0);

                System.out.println("First code point: U+" + Integer.toHexString(cp0) + " -> " + new String(Character.toChars(cp0)));
                System.out.println("Second code point: U+" + Integer.toHexString(cp1) + " -> " + new String(Character.toChars(cp1)));
                System.out.println();

                // 4. Iterating safely through all characters
                System.out.println("Iterating over code points:");
                sentence.codePoints().forEach(cp ->
                        System.out.println("U+" + Integer.toHexString(cp) + " -> " + new String(Character.toChars(cp))));



            }
}
