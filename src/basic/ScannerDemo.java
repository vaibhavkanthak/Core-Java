//code snippet to read some numbers from console and print their mean.
package basic;
import java.util.Scanner;
public class ScannerDemo {
        public static void main(String[] args){

            Scanner in = new Scanner(System.in);
            int sum = 0;
            int count = 0;

            while(in.hasNext()) {
                if (in.hasNextInt()) {
                    int num = in.nextInt();
                    sum += num;
                    count++;
                } else {
                    String input = in.next();
                    if (input.equalsIgnoreCase("q")) {
                        break;
                    } else {
                        System.out.println("Invalid input, type numbers or 'q' to quit");
                    }
                }
            }
            if(count > 0) {
                int mean = sum / count;
                System.out.println("Mean: " + mean);
            }else{
                System.out.println("No numbers entered");
            }
            in.close();
        }
}
