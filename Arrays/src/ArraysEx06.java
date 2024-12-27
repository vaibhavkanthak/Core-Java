import java.util.Scanner;

//Sorted array
public class ArraysEx06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = isSorted(arr, n);
            if(ans){
                System.out.println("Yes, Array is sorted.");
            }
            else{
                System.out.println("No, Array is not sorted.");
            }
    }

    public static boolean isSorted(int[] arr, int n){

        for(int i = 1; i < n; i++){

            if(arr[i] < arr[i -1]){
                return false;
            }
        }
        return true;
    }
}
