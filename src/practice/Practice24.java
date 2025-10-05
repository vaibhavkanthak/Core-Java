//Find the sum of first N natural numbers
package practice;
import java.util.Scanner;
public class Practice24 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: N");
            int num = sc.nextInt();
            int sum = 0;
            for(int i = 1; i <= num; i++){
                sum  +=  i;
            }
            System.out.println(sum);
            sc.close();

        }
}
