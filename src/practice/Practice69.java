//Print each character of a string
package practice;
import java.util.Scanner;
public class Practice69 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a String: ");
            String str = sc.nextLine();
            for(int i = 0; i < str.length(); i++){
                System.out.println(str.charAt(i));
            }

        }
}
