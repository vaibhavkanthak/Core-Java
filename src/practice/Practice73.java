//count total words in a string
package practice;
import java.util.Scanner;
public class Practice73 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String str = sc.nextLine().trim();
            if(str.isEmpty()){
                System.out.println("No words");
            }else{
                String[] words = str.split("\\s+");
                System.out.println("Total words: " + words.length);
            }
        }

}
