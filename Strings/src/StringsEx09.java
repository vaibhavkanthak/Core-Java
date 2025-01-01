//Binary to decimal
import java.util.Scanner;
public class StringsEx09 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Trim the input to remove leading/trailing spaces
        s = s.trim();

        // Validate input to ensure it only contains '0' and '1'
        if (!s.matches("[01]+")) {
            System.out.println("Invalid binary input.");
            return;
        }

        int temp = 0;
        int power = 1;

        for(int i = s.length() - 1; i >= 0; i--){

            temp += (s.charAt(i) - '0') * power;

            power = power * 2;
        }
            System.out.print(temp);


    }
}
