package basic;

import java.util.Locale;

public class PrintFormattingDemo {
            public static void main(String[] args){
                double x = 10000.0 / 3.0;

                // 1) Raw print vs formatted
                System.out.println("1) Raw System.out.print:");
                System.out.print(x);            // many digits (double's toString)
                System.out.print("\n\n");

                System.out.println("2) Using printf with width & precision:");
                System.out.printf("%%8.2f →[%8.2f]%n", x); // width 8, 2 decimals
                System.out.printf("%%.2f   →[%.2f]%n%n", x);

                // 2a) Locale + grouping separators (use Locale.US for predictable commas & dot)
                System.out.println("3) Grouping separator with Locale:");
                System.out.printf(Locale.US, "US   %%,.2f → [%,.2f]%n", x);
                System.out.printf(Locale.GERMANY, "DE   %%,.2f → [%,.2f]%n%n", x); // note: grouping/decimal differ

                // 3) Scientific notation & uppercase variants
                System.out.println("4) Scientific notation:");
                System.out.printf("%%.3e → [%.3e]%n", x);
                System.out.printf("%%.3E → [%.3E]%n%n", x);

                // 4) Integers: padding, signs, parentheses, bases
                int pos = 1234, neg = -1234;
                System.out.println("5) Integer formatting:");
                System.out.printf("Right-align width 8:      [%8d]%n", pos);
                System.out.printf("Left-align  width 8:      [%-8d]%n", pos);
                System.out.printf("Zero-pad width 8:         [%08d]%n", pos);
                System.out.printf("Always show sign (+):     [%+8d]%n", pos);
                System.out.printf("Space for positives:      [% 8d]%n", pos);
                System.out.printf("Parentheses for negatives:%(8d%n", neg);
                System.out.printf("Hex lower/upper:          [%x] / [%X]%n", pos, pos);
                System.out.printf("Octal:                    [%o]%n%n", pos);

                // 5) Strings: width, left-align, max length (precision)
                String name = "Vaibhav";
                System.out.println("6) String formatting:");
                System.out.printf("Default:        [%s]%n", name);
                System.out.printf("Width 10:       [%10s]%n", name);
                System.out.printf("Left-align:     [%-10s]%n", name);
                System.out.printf("Max 3 chars:    [%.3s]%n%n", name);

                // 6) Characters & booleans
                System.out.println("7) char & boolean:");
                System.out.printf("char %%c:        [%c]%n", 'A');
                System.out.printf("boolean %%b:     [%b]%n%n", (x > 0));

                // 7) Percent sign and platform newline
                System.out.println("8) Percent sign & newlines:");
                System.out.printf("Progress: 75%% complete%n");
                System.out.printf("Line1%nLine2%n%n"); // %n is the right way to newline

                // 8) Reusing/ordering arguments with indexes (%,< also exists but index is clearer)
                // %2$d = use the 2nd argument as a decimal; %1$s = use the 1st as a string
                System.out.println("9) Argument indexing:");
                System.out.printf("Name: %1$s, Age: %2$d | Age then Name: %2$d, %1$s%n%n", "Cay", 57);

                // 9) Realistic money example (2 decimals, grouping, US locale)
                double amount = 3333.3333333333335;
                System.out.println("10) Money display (dollars & cents):");
                System.out.printf(Locale.US, "Amount: $%,.2f%n", amount);

                // 10) Comparison with 'print' vs 'printf'
                System.out.println("\n11) Why printf for currency:");
                System.out.print("print  : ");
                System.out.print(amount); // raw
                System.out.print("\nprintf : ");
                System.out.printf(Locale.US, "$%,.2f%n", amount);

            }
}
