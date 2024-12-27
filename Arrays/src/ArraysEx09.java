import java.util.Scanner;

//Sum of the array elements
public class ArraysEx09 {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){

            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j = 0; j < n; j++){

            sum += arr[j];

        }
        System.out.println(sum);



    }
}
