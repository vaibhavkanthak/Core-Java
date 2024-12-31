import java.util.Scanner;

//Pangram checking in java
public class StringsEx05 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to to check if it is a pangram:");
        String str = sc.nextLine();
        if(isPangram(str))
            System.out.println("The string is pangram.");
        else
            System.out.println("The string is not pangram.");
        sc.close();
    }

    public static boolean isPangram(String str){
        int n = str.length();
        if(n < 26)
            return false;
        boolean[] visited = new boolean[26];
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
                visited[ch - 'a'] = true;
            if(ch >= 'A' && ch <= 'Z')
                visited[ch - 'A'] = true;
        }
        for(int i = 0; i < 26; i++){
            if(!visited[i])
                return false;
        }
        return true;
    }

}
