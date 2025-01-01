//Decimal to binary
import java.util.Scanner;
public class StringsEx08 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        while(n > 0){

            s = (n % 2) + s;
            n = n / 2;

        }
        System.out.println("Decimal representation of given number is " + s);

    }
}
