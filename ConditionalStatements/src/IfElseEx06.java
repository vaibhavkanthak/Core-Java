// Leap year program using if else
import java.util.Scanner;
public class IfElseEx06 {

     public static void main(String[] args){

         Scanner sc = new Scanner(System.in);

         System.out.println("Please enter year.");

         int year = sc.nextInt();

         if(year % 4 == 0 && year % 100 != 0){
             System.out.println( year + " is Leap year.");
         }
         else if(year % 400 == 0){

             System.out.println( year + " is Leap year");
         }
         else{

             System.out.println( year + " is not Leap year");
         }
     }

}
