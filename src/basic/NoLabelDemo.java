package basic;
public class NoLabelDemo {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int target = 50;
        boolean found = false;
        int row = -1, col = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    row = i;
                    col = j;
                    break; // exits only the inner loop
                }
            }
            if (found) break; // we need another break here for outer loop
        }

        if (found) {
            System.out.println("Found " + target + " at row " + row + ", col " + col);
        } else {
            System.out.println("Number not found.");
        }
    }
}