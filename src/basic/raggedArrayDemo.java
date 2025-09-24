//java ragged array example
package basic;

public class raggedArrayDemo {
        public static void main(String[] args){
            //Create ragged array with 3 rows
            int[][] ragged = new int[3][];

            //Different column sizes
            ragged[0] = new int[2]; //row 0 -> 2 cols
            ragged[1] = new int[4]; //row 1 -> 4 cols
            ragged[2] = new int[3]; //row 2 -> 3 cols

            //Fill with values loop
            int value = 1;
            for(int i = 0; i < ragged.length; i++){
                for(int j = 0; j < ragged[i].length; j++){
                    ragged[i][j] = value++;
                }
            }

            //Print array now
            for (int i = 0; i < ragged.length; i++) {
                for (int j = 0; j < ragged[i].length; j++) {
                    System.out.print(ragged[i][j] + " ");
                }
                System.out.println();
            }


        }
}
