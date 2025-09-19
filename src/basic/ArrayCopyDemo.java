package basic;

import java.util.Arrays;

public class ArrayCopyDemo {
        public static void main(String[] args){
            //Original array
            int[] smallPrimes = {2, 3, 5, 7, 11, 13};

            // 1) Copying by reference (not real copy)
            int[] luckyNumbers = smallPrimes;               //Both point to same array
            luckyNumbers[5] = 12;                   //modify thru luckyNumbers

            System.out.println("smallPrimes after change: " + Arrays.toString(smallPrimes));
            System.out.println("luckyNumbers after change: " + Arrays.toString(luckyNumbers));

            // 2) Real copy using Arrays.copyOf
            int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
            copiedLuckyNumbers[0] = 99;

            System.out.println("\nOriginal (luckyNumbers): " + Arrays.toString(luckyNumbers));
            System.out.println("Copied (copiedLuckyNumbers): " + Arrays.toString(copiedLuckyNumbers));

            // 3) Increase length of array
            luckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
            System.out.println("\nAfter increasing size: " + Arrays.toString(luckyNumbers));

            // 4) Decrease length of array
            int[] shorter = Arrays.copyOf(luckyNumbers, 3);
            System.out.println("After decreasing size: " + Arrays.toString(shorter));


        }
}
