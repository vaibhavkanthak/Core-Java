//Convert kilometers to miles
package practice;
import java.util.Scanner;
public class Practice53 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter distance in kilometers: ");
            double km = sc.nextDouble();
            double miles = km * 0.621371;
            System.out.println(km + "km = " + miles + " miles");

        }
}
