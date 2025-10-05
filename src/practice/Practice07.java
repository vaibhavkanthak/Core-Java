//Convert days into years, weeks, and days
package practice;

public class Practice07 {
        public static void main(String[] args){
            int days = 500;
            int years = days / 365;
            //int months = days / 30;
            int weeks = (days % 365) / 7;
            int remainingDays = (days % 365) % 7;


            System.out.println("years: " + years);
            //System.out.println("Months:" + months);
            System.out.println("weeks: " + weeks);
            System.out.println("Days: " + remainingDays);
        }
}
