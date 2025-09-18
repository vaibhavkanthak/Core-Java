package basic;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalPracticalDemo {
        public static void main(String[] args){
            //Principal
            BigDecimal principal = new BigDecimal("1000.00");

            // Annual interest rate = 5% (0.05)
            BigDecimal rate = new BigDecimal("0.05");

            // Number of years = 3
            int years = 3;

            // Formula: A = P * (1 + r)^n
            BigDecimal onePlusRate = BigDecimal.ONE.add(rate); // (1 + r)
            BigDecimal amount = principal.multiply(onePlusRate.pow(years));

            // Round to 2 decimal places like money
            amount = amount.setScale(2, RoundingMode.HALF_UP);

            System.out.println("Principal: " + principal);
            System.out.println("Rate: " + rate.multiply(BigDecimal.valueOf(100)) + "%");
            System.out.println("Years: " + years);
            System.out.println("Final Amount (with BigDecimal): " + amount);

        }








}
