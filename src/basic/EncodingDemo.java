/**
 * This is java program explaining encoding and decoding
 * UTF-8
 * @author vaibhav kanthak
 *
 */
package basic;
import java.nio.charset.*;
import java.util.Arrays;

public class EncodingDemo {
        public static void main(String[] args) throws Exception{
            String text = "नमस्ते";

            //java string is UTF-16 internally
            char[] chars = text.toCharArray();
            System.out.println("UTF-16 code units: " + Arrays.toString(chars));
            for (char c : text.toCharArray()) {
                System.out.println(" " + (int)c);
            }
            //encodding to UTF-8
            byte[] utf8 = text.getBytes("UTF-8");
            System.out.println("UTF-8 bytes: " + Arrays.toString(utf8));

            // Decode back from UTF-8
            String back = new String(utf8, "UTF-8");
            System.out.println("Decoded: " + back);

        }
}