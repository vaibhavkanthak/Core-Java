//Switch program example in week
import java.util.Scanner;
public class SwitchEx02 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number from (1-7).");
        int dayInNumber = sc.nextInt();
        String weekday;

        switch(dayInNumber){

            case 1: weekday = "Monday"; break;
            case 2: weekday = "Tuesday"; break;
            case 3: weekday = "Wednesday"; break;
            case 4: weekday = "Thursday"; break;
            case 5: weekday = "Friday"; break;
            case 6: weekday = "Saturday"; break;
            case 7: weekday = "Sunday"; break;
            default: weekday = "Invalid day";

        }

        System.out.println(weekday);
        sc.close();
    }
}
