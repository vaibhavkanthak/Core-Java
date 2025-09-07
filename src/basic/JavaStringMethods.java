package basic;

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
        }
}
