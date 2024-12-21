// Java Program to Demonstrate use of String to
// Control a Switch Statement
public class stringSwitchEx01 {

    public static void main(String[] args){

        String str = "two";

        switch(str){

            case "one": System.out.println("one"); break;
            case "two": System.out.println("two"); break;
            case "three": System.out.println("three"); break;
            default: System.out.println("no match");


        }
    }
}
