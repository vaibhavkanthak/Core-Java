import java.util.Scanner;

//Factorial of Number
public class LoopsEx16 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int factorial = 1;
        while(number > 0 ){

            factorial = factorial * number;

            number--;
        }

        System.out.println("Factorial of given number is " + factorial);

    }
}
