//Reverse a string
import java.util.Scanner;
public class StringsEx07 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int ptr = str.length();
            String str1 = "";

            for(int i = ptr - 1; i >= 0; i--){

                str1 = str1 + str.charAt(i);
            }
            System.out.println(str1);

    }
}
