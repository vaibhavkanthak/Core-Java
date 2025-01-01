// Pattern searach in given string
import java.util.Scanner;
public class StringsEx10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pat = sc.nextLine();
        int n = pat.length();
        for(int i = 0; i < str.length() - n + 1; i++){

            if(str.substring(i, i + n).equals(pat)){

                System.out.print(i + " ");
            }

        }
    }
}
