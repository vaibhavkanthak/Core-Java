//Count words in a sentence
package practice;
public class Practice42 {
        public static void main(String[] args){
            String str = "Java is a powerful language";
            String[] words = str.split(" ");
            System.out.println("word count: " + words.length);
            for( String word : words){
                System.out.println(word);
            }
        }
}
