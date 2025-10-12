//Remove duplicate elements from array without sorting
package practice;
public class Practice87 {
        public static void main(String[] args){
            int[] arr = {5, 3, 8, 3, 9, 5, 1};
            int[] temp = new int[arr.length];
            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                boolean isDuplicate = false;

                // Check if arr[i] appeared before
                for (int k = 0; k < j; k++) {
                    if (arr[i] == temp[k]) {
                        isDuplicate = true;
                        break; // No need to check further
                    }
                }

                // If not duplicate, add to temp
                if (!isDuplicate) {
                    temp[j++] = arr[i];
                }
            }

            System.out.print("Array without duplicates: ");
            for (int i = 0; i < j; i++) {
                System.out.print(temp[i] + " ");
            }
        }
}
