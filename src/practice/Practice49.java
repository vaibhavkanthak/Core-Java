//Find the sum and average of array elements
package practice;
public class Practice49 {
        public static void main(String[] args){
            int[] arr = {23, 33, 44, 55, 66};
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
            System.out.println("sum: " + sum);
            System.out.println("Average: " + (double) sum / arr.length);
        }
}
