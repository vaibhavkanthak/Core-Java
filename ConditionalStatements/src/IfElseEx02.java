//Take number n from user, print a sum of n natural numbers, if user enters a negative number, show error and exit.
import java.util.Scanner;
public class IfElseEx02 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Please enter positive natural number.");
            return;
        }


        System.out.println( "Sum of numbers til " + n + " is " + n *(n +1) / 2 );

    }
}
