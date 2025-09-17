package basic;
public class LabelBreakDemo {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int target = 50;
        boolean found = false;

        search: // label for outer loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    System.out.println("Found " + target + " at row " + i + ", col " + j);
                    break search; // break out of BOTH loops
                }
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }
    }
}