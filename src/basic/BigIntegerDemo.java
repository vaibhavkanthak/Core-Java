package basic;

import java.math.BigInteger;

public class BigIntegerDemo {
        public static void main(String[] args){
            //create BigIntegers
            BigInteger a = BigInteger.valueOf(100);
            BigInteger b = new BigInteger("474623874293432462894823842386482346297842384687924");

            // Arithmetic operations (can't use +, -, *, / directly!)
            BigInteger sum = a.add(b);
            BigInteger product = a.multiply(b);
            BigInteger power = a.pow(5);

            //constants
            BigInteger zero = BigInteger.ZERO;
            BigInteger one = BigInteger.ONE;
            BigInteger ten = BigInteger.TEN;
            BigInteger two = BigInteger.TWO;

            // Print results
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("a + b = " + sum);
            System.out.println("a * b = " + product);
            System.out.println("a^5 = " + power);
            System.out.println("Constants: " + zero + ", " + one + ", " + ten + ", " + two);









        }
}
