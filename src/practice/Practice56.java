//Calculate Simple Interest
package practice;
import java.util.Scanner;
public class Practice56 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("enter principal: ");
            float p = sc.nextFloat();
            System.out.println("enter rate: ");
            float r = sc.nextFloat();
            System.out.println("enter time in years: ");
            float t = sc.nextFloat();

            float si = (p * r * t) / 100;
            System.out.println("Simple Interest = " + si);
        }
}
