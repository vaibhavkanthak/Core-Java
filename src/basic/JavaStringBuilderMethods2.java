package basic;

public class JavaStringBuilderMethods2 {
    public static void main(String[] args) {
        // 1. Construct an empty StringBuilder
        StringBuilder builder = new StringBuilder();
        System.out.println("1. Empty builder created");
        System.out.println("Length: " + builder.length()); // length = 0
        System.out.println("Capacity (initial): " + builder.capacity());

        // 2. append(String str)
        builder.append("Hello");
        System.out.println("\n2. After append(\"Hello\"): " + builder);

        // 3. append(char c)
        builder.append(' ');
        builder.append('W');
        builder.append('o');
        builder.append('r');
        builder.append('l');
        builder.append('d');
        System.out.println("3. After appending chars: " + builder);

        // 4. appendCodePoint(int cp) → Unicode 🍺 (U+1F37A)
        builder.appendCodePoint(0x1F37A);
        System.out.println("4. After appendCodePoint(0x1F37A): " + builder);

        // 5. setCharAt(int i, char c)
        builder.setCharAt(6, 'w'); // replace 'W' with 'w'
        System.out.println("5. After setCharAt(6, 'w'): " + builder);

        // 6. insert(int offset, String str)
        builder.insert(5, ",");
        System.out.println("6. After insert(5, \",\"): " + builder);

        // 7. insert(int offset, char c)
        builder.insert(0, '*');
        System.out.println("7. After insert(0, '*'): " + builder);

        // 8. delete(int startIndex, int endIndex)
        builder.delete(0, 2); // delete '*' and 'H'
        System.out.println("8. After delete(0, 2): " + builder);

        // 9. length()
        System.out.println("9. Current length: " + builder.length());

       // 10. Capacity()
        System.out.println("10. Current capacity: " + builder.capacity());
        //Default capacity = 16, but it expands automatically (usually oldCapacity * 2 + 2).

        // 11. replace(int start, int end, String str)
        builder.replace(0, 4, "JAVA");
        System.out.println("11. After replace(0, 4, \"JAVA\"): " + builder);

        //12. reverse()
        builder.reverse();
        System.out.println("12. After reverse(): " + builder);

        // 13. toString()
        String finalString = builder.toString();
        System.out.println("13. Final string from builder: " + finalString);
    }
}