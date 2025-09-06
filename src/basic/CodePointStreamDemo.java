package basic;

public class CodePointStreamDemo {

            public static void main(String[] args){

                String original = "A😀न𝕆Z";
                System.out.println("Original: " + original);

                // 1. Convert to array of code points
                int[] codePoints = original.codePoints().toArray();
                System.out.println("\nCode points in hex: ");
                for (int cp : codePoints){
                    System.out.println("U+" + Integer.toHexString(cp).toUpperCase() + " -> " + new String(Character.toChars(cp)));
                }
                // 2. Rebuild string from code point array
                String rebuilt = new String(codePoints, 0, codePoints.length);
                System.out.println("\nRebuilt string: " + rebuilt);

                // 3. Turn a single code point into a string
                int beerMug = 0x1F37A; // 🍺 (Beer Mug)
                String beer = Character.toString(beerMug);
                System.out.println("\nSingle code point (🍺): " + beer);
            }
}
