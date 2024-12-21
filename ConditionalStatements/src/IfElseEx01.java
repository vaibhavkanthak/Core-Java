// If else statement to check given number is even or odd.
import java.util.*;
public class IfElseEx01 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");

        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Its a even number");  //You can write only if statement its not compulsory to write else part.
        }
        else{
            System.out.println("Its a odd number");
        }



    }
}
