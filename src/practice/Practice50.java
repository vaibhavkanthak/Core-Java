//Reverse the elements of an array ( not the array )
package practice;
public class Practice50 {
        public static void main(String[] args){
            int[] arr = {12, 23, 34, 45, 56};
            System.out.println("Original array:");
            for(int n : arr){
                System.out.print(n + " ");
            }
            System.out.println("\nReversed array: ");
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
        }
}
