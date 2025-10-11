//Count the number of vowels and consonants
package practice;
import java.util.Scanner;
public class Practice70 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine().toLowerCase();
            int vowels = 0, constants = 0;
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if(Character.isLetter(ch)){
                    if("aeiou".indexOf(ch) != -1){
                        vowels++;
                    }else{
                        constants++;
                    }
                }
            }
            System.out.println("vowels: " + vowels + ", constants: " + constants);

        }
}
