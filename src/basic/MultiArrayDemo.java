package basic;

import java.util.Arrays;

public class MultiArrayDemo {
        public static void main(String[] args){
            //Declare a 2D array ( 3 rows, 3 columns)
            int[][] matrix = new int[3][3];

            //Fill the array with values
            int num = 1;
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){

                    matrix[i][j] = num++;

                }
            }

            //Print the array
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println(Arrays.toString(matrix)); // prints weird addresses
            System.out.println(Arrays.deepToString(matrix));

            int rows = matrix.length;
            int cols = matrix[0].length;
            System.out.println(rows);
            System.out.println(cols);

        }
}
