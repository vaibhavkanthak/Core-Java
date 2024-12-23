//Pyramid Pattern using for loop
import java.util.Scanner;
public class LoopEx15 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int count = 1;
        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= rows - i; j++){

               System.out.print(" ");
            }

            for(int k = 1; k <= ((2*i) -1); k++) {

                System.out.print(count);
            }
            count = count + 1;
            System.out.println();
        }


    }
}
