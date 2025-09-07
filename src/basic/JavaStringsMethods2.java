package basic;

public class JavaStringsMethods2 {
    public static void main(String[] args) {
        String text = "This is a simple string example.";

        // 1. indexOf(String str)
        int index1 = text.indexOf("simple");
        System.out.println("indexOf(\"simple\"): " + index1);

        // 2. indexOf(String str, int fromIndex)
        int index2 = text.indexOf("is", 3);
        System.out.println("indexOf(\"is\", 3): " + index2);

        // 3. indexOf(int cp)
        int index3 = text.indexOf('s'); // using char (treated as code point)
        System.out.println("indexOf('s'): " + index3);

        // 4. indexOf(int cp, int fromIndex)
        int index4 = text.indexOf('s', 5);
        System.out.println("indexOf('s', 5): " + index4);

        // 5. When substring/codepoint not found
        int index5 = text.indexOf("notfound");
        System.out.println("indexOf(\"notfound\"): " + index5);

        int index6 = text.indexOf('z');
        System.out.println("indexOf('z'): " + index6);

        // ----- lastIndexOf() examples -----
        System.out.println("\n----- lastIndexOf() examples -----");
        int last1 = text.lastIndexOf("is");
        System.out.println("lastIndexOf(\"is\"): " + last1);

        int last2 = text.lastIndexOf("is", 4);
        System.out.println("lastIndexOf(\"is\", 4): " + last2);

        int last3 = text.lastIndexOf('s');
        System.out.println("lastIndexOf('s'): " + last3);

        int last4 = text.lastIndexOf('s', 4);
        System.out.println("lastIndexOf('s', 4): " + last4);

        int last5 = text.lastIndexOf("xyz");
        System.out.println("lastIndexOf(\"xyz\"): " + last5);
    }
}