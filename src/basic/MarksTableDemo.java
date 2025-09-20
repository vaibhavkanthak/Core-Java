package basic;

public class MarksTableDemo {
        public static void main(String[] args){
            int[][] marks = {{67, 78, 90},{45, 77, 99}};

            //Prints marks table
            for(int i = 0; i < marks.length; i++){
                System.out.print("Student " + (i + 1) + ": ");
                for(int j = 0; j < marks[i].length; j++){
                    System.out.print(marks[i][j] + " ");
                }
                System.out.println();
            }


        }
}
