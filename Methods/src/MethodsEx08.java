//First digit of number
import java.util.Scanner;
public class MethodsEx08 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("First digit of a given numbe is " + getFirstDigit(number));

    }
    public static int getFirstDigit(int number){

        while(number >= 10){

            number = number / 10;
        }
        return number;
    }
}
