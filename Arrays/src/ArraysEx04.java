// Program to print 2D array in tabular form.
public class ArraysEx04 {

    public static void main(String[] args){

        int[][] arr;
        arr = new int[2][3];

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

                arr[i][j] = 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
