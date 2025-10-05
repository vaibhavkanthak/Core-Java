//Convert given seconds into hours, minutes, and seconds
package practice;
public class Practice20 {
        public static void main(String[] args){
            int totalSeconds = 3665;

            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println("Seconds: " + seconds);

        }
}
