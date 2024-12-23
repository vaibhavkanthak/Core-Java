//Greatest common divisor of two number
import java.util.Scanner;
public class LoopsEx17 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int minOfTwo = Math.min(a, b);
        int answer = 1;
            for(int i = 1; i <= minOfTwo; i++){

                if(a % i == 0 && b % i == 0){

                    answer = i;
                }
            }
        System.out.println("Greatest common divisor is " + answer);
    }
}