//Sort an array in ascending and descending order (without using Arrays.sort)
package practice;
public class Practice51 {
        public static void main(String[] args){
            int[] arr = {5, 3, 6, 2, 1, 8};

            int temp = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Ascending order:");
            for(int n : arr){
                System.out.print(n + " ");
            }
            System.out.println("\nDescending order");
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
        }
}
