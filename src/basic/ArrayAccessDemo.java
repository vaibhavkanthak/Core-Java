package basic;

import java.util.Arrays;

public class ArrayAccessDemo {
        public static void main(String[] args){
            // 1) Create and fill an int array 0..99
            int[] a = new int[100];
            for(int i = 0; i < a.length; i++){
                a[i] = i;
            }
            System.out.println("a[0] = " + a[0] + ", a[99] = " + a[99] + ", length = " + a.length);

            // 2) Default initial values for numeric, boolean, object arrays
            double[] d = new double[3];
            boolean[] bools = new boolean[2];
            String[] names = new String[4];
            System.out.println("double defaults: " + Arrays.toString(d));
            System.out.println("boolean defaults: " + Arrays.toString(bools));
            System.out.println("String defaults: " + Arrays.toString(names));

            // 3) Fill an object array with empty strings if you want empty strings (not null)
            for (int i = 0; i < names.length; i++) names[i] = "";
            System.out.println("String after filling empty strings: " + Arrays.toString(names));

            // 4) Enhanced for-each loop vs indexed loop
            int[] small = {2, 3, 5, 7, 11};
            System.out.print("for-each prints: ");
            for (int val : small) System.out.print(val + " ");
            System.out.println();


            // Attempt to modify elements using for-each (this DOES NOT change primitive array elements)
            for (int val : small) val = val * 2; // val is a copy of each element
            System.out.println("After attempted doubling with for-each (no change): " + Arrays.toString(small));

            // Correct way to modify array elements: indexed loop
            for (int i = 0; i < small.length; i++) small[i] = small[i] * 2;
            System.out.println("After doubling with indexed loop: " + Arrays.toString(small));

            // 5) Arrays.toString handy printing
            System.out.println("small as string: " + Arrays.toString(small));

            // 6) Zero-length array vs null
            int[] zeroLen = new int[0];
            int[] nullArr = null;
            System.out.println("zeroLen length = " + zeroLen.length + ", zeroLen == null? " + (zeroLen == null));
            System.out.println("nullArr == null? " + (nullArr == null));

            // 7) Array index out of bounds demonstration (catch the exception)
            try {
                int bad = a[100]; // valid indices are 0..99 → this throws
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Caught exception: " + ex);
            }

            // 8) When you need the index (example: find first element > 95)
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 95) {
                    System.out.println("First element >95 found at index " + i + " with value " + a[i]);
                    break;
                }
            }

        }
}
