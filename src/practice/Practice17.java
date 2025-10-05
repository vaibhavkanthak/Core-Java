//Input marks of 3 subjects and find total, percentage, and grade
package practice;
import java.util.Scanner;
public class Practice17 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks for subject 1: ");
            int s1 = sc.nextInt();
            System.out.println("Enter marks for subject 2: ");
            int s2 = sc.nextInt();
            System.out.println("Enter marks for subject 3: ");
            int s3 = sc.nextInt();

            int total = s1 + s2 + s3;
            double percentage = total / 3.0;

            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage + "%");

            if(percentage >=  75){
                System.out.println("Grade A");
            }else if(percentage >= 60){
                System.out.println("Grade B");
            }else if(percentage >= 40){
                System.out.println("Grade  c");
            }else{
                System.out.println("Fail");
            }

            sc.close();





        }
}
