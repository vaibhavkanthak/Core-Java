//remove all vowels from a string
package practice;
import java.util.Scanner;
public class Practice75 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String result = str.replaceAll("[AEIOUaeiou]", "");
            System.out.println("Without vowels: " + result);

        }
}
