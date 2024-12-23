import java.util.Scanner;

// Table of a number
public class LoopsEx09 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int number = sc.nextShort();

        int count;
        int tableNumber;

        for(count = 1; count <= 10; count++) {

            tableNumber = (number * count);

            System.out.print(tableNumber + "\t");

        }

    }

}
