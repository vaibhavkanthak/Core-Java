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

            //method 4
            String str1 = "Apple";
            String str2 = "Orange";
            String str3 = "Apple";
            System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
            System.out.println("str2.compareTo(str1): " + str2.compareTo(str1));
            System.out.println("str1.compareTo(str3):" + str1.compareTo(str3));
        }
}
