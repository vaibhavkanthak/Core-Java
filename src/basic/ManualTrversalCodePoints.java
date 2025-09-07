package basic;

public class ManualTrversalCodePoints {

        public static void main(String[] args){

            String text = "A😀न𝕆Z";
            // Contains: 'A' (1 unit), '😀' (2 units), 'न' (1 unit), '𝕆' (2 units), 'Z' (1 unit)

            System.out.println("Manual traversal:");
            for(int i = 0; i < text.length(); ){
                int cp = text.codePointAt(i);

                // Print the code point in hex and its character
                System.out.println("U+" + Integer.toHexString(cp) + " -> " +
                        new String(Character.toChars(cp)));

                if (Character.isSupplementaryCodePoint(cp)){
                    i += 2;
                } else {
                    i++;
                }

            }
        }
}
