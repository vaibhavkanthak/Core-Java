//Convert hours into minutes and seconds
package practice;
import java.util.Scanner;
public class Practice55 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter hours: ");
            int hours = sc.nextInt();
            int minutes = hours * 60;
            int seconds = hours * 3600;
            System.out.println(hours + "hours " + " = " + minutes + " minutes or " + seconds + " seconds ");
        }
}
