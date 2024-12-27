//Jagged array of user, print Inverted triangle
public class ArraysEx05 {

    public static void main(String[] args){

        int m = 3;
        int arr[][];
        arr = new int[m][];
        int count = 0;
        for(int i = 0; i < arr.length; i++){

            arr[i] = new int[i + 1];
            count += 2;
            for(int j = 0; j < arr[i].length; j++){

                System.out.print(count);

            }
            System.out.println();
        }
    }
}
