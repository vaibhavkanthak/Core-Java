//Find the smallest element in an array
package practice;
public class Practice80 {
        public static void main(String[] args){
            int[] arr = {29, 34, 45, 66, 12};
            int min = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.println("Smallest element: " + min);
        }
}
