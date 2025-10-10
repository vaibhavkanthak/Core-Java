//Convert total seconds into days, hours, minutes, seconds
package practice;
import java.util.Scanner;
public class Practice58{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter total seconds: ");
            int totalSeconds = sc.nextInt();

            int days = totalSeconds / 86400;
            totalSeconds %= 86400;
            int hours = totalSeconds / 3600;
            totalSeconds %= 3600;
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;

            System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds ");

        }
}
