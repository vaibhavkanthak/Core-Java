//Search an element in an array (Linear Search)
package practice;
import java.util.Scanner;
public class Practice84 {
        public static void main(String[] args){
            int[] arr = {12, 23, 33, 44, 55};
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a element to search: ");
            int key = sc.nextInt();
            boolean found = false;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == key){
                    System.out.println("Element found at index: " + i);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Element not found.");
            }
        }
}
