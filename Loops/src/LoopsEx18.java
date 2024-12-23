//Least common multiple of two numbers
import java.util.Scanner;

public class LoopsEx18 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxOfTwo = Math.max(a, b);
        int commonMultiple = a * b;

        for(int i = maxOfTwo; i <= commonMultiple; i++){

            if(i % a == 0 && i % b == 0){

                System.out.println("Answer is " + i);
                break;
            }

        }




    }

}
