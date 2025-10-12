//Remove duplicate elements from array
package practice;
import java.util.Arrays;
public class Practice86 {
        public static void main(String[] args){
            int[] arr = {5, 3, 8, 3, 9, 5, 1};
            Arrays.sort(arr);
            int[] temp = new int[arr.length];
            int j = 0;

            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] != arr[i + 1]){
                    temp[j++] = arr[i];
                }
            }
            temp[j++] = arr[arr.length -1];

            System.out.print("Array without duplicates: ");
            for(int i = 0; i < j; i++){
                System.out.print(temp[i] + " ");
            }
        }
}
