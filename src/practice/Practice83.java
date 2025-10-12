//Sort an array in ascending order
package practice;
import java.util.Arrays;
public class Practice83 {
        public static void main(String[] args){
            int[] arr = {4, 3, 2, 1, 6};

            for(int i = 0; i < arr.length - 1; i++){
                for(int j = 0; j < arr.length - i - 1; j++){
                    if(arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted array in ascending order: ");
            for(int num : arr){
                System.out.print(num + " ");

            }

        }
}

