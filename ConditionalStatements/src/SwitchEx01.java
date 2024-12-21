//Switch statement explained in below program
import java.util.Scanner;
public class SwitchEx01 {

    public static void main(String[] args){

        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your move");
        char move = sc.next().charAt(0);

        switch(move){

            case 'L':
                x--;
                break;

            case 'R':
                x++;
                break;

            case 'U':
                y++;
                break;

            case 'D':
                y--;
                break;

            default:
                System.out.println("Invalid move");
                break;


        }

        System.out.println("Current position: (" + x + ", " + y + ")");
        sc.close(); // Close the scanner
    }
}
