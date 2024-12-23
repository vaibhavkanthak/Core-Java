import java.util.Scanner;

//Triangular pattern
public class LoopsEx13 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        //int columns = sc.nextInt();

        for(int i = 1; i <= rows; i++){

            for(int j = 1; j <= i; j++){

                System.out.print("*");


            }
            System.out.println();
        }


    }
}
