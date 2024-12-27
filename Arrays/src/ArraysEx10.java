import java.util.Scanner;

//Average of all elements of array
public class ArraysEx10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        int sum = 0;
        float average = 0;
        for(int j = 0; j < n; j++){

            sum += arr[j];
        }
        average = (float) sum /n;
        System.out.println(average);
    }
}
