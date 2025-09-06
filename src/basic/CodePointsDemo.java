package basic;

public class CodePointsDemo {

        public static void main(String[] args){

            String normal = "A";
            String hindi = "न";
            String emoji = "😄";

            System.out.println(normal + "length: " + normal.length());
            System.out.println(hindi + "length: " + hindi.length());
            System.out.println(emoji + "length: " + emoji.length());

            //properly count code points
            System.out.println("Emoji code points: " + emoji.codePointCount(0, emoji.length()));

        }
}
