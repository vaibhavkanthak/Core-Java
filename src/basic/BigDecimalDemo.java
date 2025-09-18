package basic;
import java.math.BigDecimal;
public class BigDecimalDemo {
        public static void main(String[] args){
            // Normal double has rounding problems
            // Normal double has rounding problems
            double d1 = 0.1;
            double d2 = 0.2;
            System.out.println("0.1 + 0.2 (double) = " + (d1 + d2));

            // BigDecimal avoids that
            BigDecimal bd1 = new BigDecimal("0.1");
            BigDecimal bd2 = new BigDecimal("0.2");

            BigDecimal bdSum = bd1.add(bd2);
            BigDecimal bdProduct = bd1.multiply(bd2);

            System.out.println("0.1 + 0.2 (BigDecimal) = " + bdSum);
            System.out.println("0.1 * 0.2 (BigDecimal) = " + bdProduct);


        }
}
