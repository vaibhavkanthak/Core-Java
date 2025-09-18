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
/*
Detailed explanations (line-by-line important points)
	1.	Indexing starts at 0; last index is length - 1.
	•	a[0] is the first element, a[99] is the last in new int[100]. Trying a[100] throws ArrayIndexOutOfBoundsException.
	2.	Filling an array is usually done with a loop.
	•	for (int i = 0; i < a.length; i++) a[i] = i; safely uses a.length so you never go past the bounds.
	3.	Default values when you allocate an array:
	•	numeric (byte, short, int, long, float, double) → 0 or 0.0.
	•	boolean → false.
	•	reference types (String, objects) → null.
That’s why String[] names = new String[4]; prints [null, null, null, null].
	4.	If you want empty strings instead of nulls, you must assign them:
	•	for (int i=0; i<names.length; i++) names[i] = "";
	5.	Enhanced for-each loop (for (var : collection)) reads elements, not indices.
	•	It’s concise and safer (no off-by-one), but you do not get the index inside the loop.
	•	For primitive arrays the loop variable is a copy of each element. Changing it (val = val * 2) does NOT change the array.
	•	For object arrays the loop variable is a copy of the reference — you cannot reassign the array slot by changing the loop variable, but you can call methods on the referenced object to mutate it.
	6.	To modify array elements, use an indexed for loop.
	•	for (int i=0; i<small.length; i++) small[i] *= 2; actually updates array contents.
	7.	Arrays.toString(array) is a quick way to print arrays.
	•	Import java.util.Arrays and call Arrays.toString(a) for a readable string like [2, 3, 5].
	8.	Empty arrays vs. null:
	•	new int[0] is a real array object with length 0. It is not null.
	•	int[] arr = null; means the variable points to nothing; accessing arr.length would throw NullPointerException.
	9.	Always use a.length in loops to avoid out-of-bounds.
	•	Avoid hardcoding values like for (int i = 0; i < 100; i++) unless you’re certain the array has that length.
	10.	When you need the index inside the loop (e.g., to modify elements or to print index), you must use a classic indexed for loop, not for-each.

 */
