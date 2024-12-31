//Example of stringBuilder class
public class StringsEx02 {

    public static void main(String[] args){

        StringBuilder str1 = new StringBuilder("mutable with no thread safety.");
        StringBuilder str2 = str1;
        str1 = str1.append("appending now");
        if(str1 == str2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }

}
