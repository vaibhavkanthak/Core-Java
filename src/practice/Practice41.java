//Count the number of vowels and consonants in a string
package practice;
public class Practice41 {
        public static void main(String[] args){
            String str = "Java Programming";
            str = str.toLowerCase();

            int vowels = 0, constants = 0;
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);

                if(ch >= 'a' && ch <= 'z'){
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                        vowels++;
                    }else{
                        constants++;
                    }
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Constants: " + constants);
        }
}
