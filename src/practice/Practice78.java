//Find the sum of all elements in an array
package practice;
public class Practice78 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("sum is "+sum);
    }
}
