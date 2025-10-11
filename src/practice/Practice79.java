//Find the largest element in an array
package practice;
public class Practice79 {
        public static void main(String[] args){
            int[] arr = {12, 14, 11, 45, 10};
            int max = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println("Largest element: " + max);
        }
}
