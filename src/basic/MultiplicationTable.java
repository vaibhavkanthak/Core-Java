package loops;
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = input.nextInt();

        for(int i = 0; i <= 10; i++){
           int result = num * i;
           System.out.println(result);
        }
    }
}
