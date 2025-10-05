//Check whether a year is leap year or not
package practice;
import java.util.Scanner;
public class Practice15 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter year: ");
            int year = sc.nextInt();

            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                System.out.println(year + " is a leap year");
            }else{
                System.out.println(year + " is not a leap year");
            }
            sc.close();
        }
}
