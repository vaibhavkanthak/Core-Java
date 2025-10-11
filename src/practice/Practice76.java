//Check if two strings are anagrams
package practice;
import java.util.Arrays;
import java.util.Scanner;
public class Practice76 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first string: ");
            String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
            System.out.println("Enter second string");
            String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

            if(str1.length() != str2.length()){
                System.out.println("Not a Anagrams");
                return;
            }
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)){
                System.out.println("Strings are anagrams");
            }else{
                System.out.println("Not a Anagrams");
            }
        }
}
