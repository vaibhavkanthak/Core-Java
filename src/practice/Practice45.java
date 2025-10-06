//Find frequency of a given character in a string
package practice;
public class Practice45 {
        public static void main(String[] args){
            String str = "coding and programming";
            char ch = 'g';
            int count = 0;

            for(int i = 0; i < str.length(); i ++){
                if(str.charAt(i) == ch){
                    count++;
                }
            }
            System.out.println("Frequency of " + ch + " = " + count);
        }
}
