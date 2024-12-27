import java.util.Scanner;

//Count Distinct elements of array
public class ArraysEx07 {

    public static void main(String[] args) {
            int[] array = {1, 2, 2, 3, 4, 4, 5, 5, 5};
            int distinctCount = countDistinct(array);
            System.out.println("Number of distinct elements: " + distinctCount);
        }

        public static int countDistinct(int[] array) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                boolean isDistinct = true;
                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        isDistinct = false;
                        break;
                    }
                }
                if (isDistinct) {
                    count++;
                }
            }
            return count;
    }
}

