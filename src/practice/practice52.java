//Find the cube of a given number
package practice;
import java.util.Scanner;
public class practice52 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Eneter a number: ");
            int num = sc.nextInt();
            int cube = num * num * num;
            System.out.println("Cube of " + num + " " +cube);
        }
}
