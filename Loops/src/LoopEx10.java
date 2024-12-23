import java.util.Scanner;

//Table of number using while loop
public class LoopEx10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 1;
        while(count <= 10){

            System.out.print((number * count) + "\t");

            count++;

        }

    }
}
