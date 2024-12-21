//basic calculator performing addition, subtraction, and multiplication using if else.
import java.util.Scanner;
public class IfElseEx07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select what operation do you want to perform.\n for Addition enter -> 1\n for Subtraction enter -> 2\n for Multiplication enter -> 3 ");
        int operation = sc.nextInt();

        if(operation != 1 && operation != 2 && operation != 3){

            System.out.println("Invalid input");
        }
        else{

            System.out.println("Enter First Number");
            int a = sc.nextInt();
            System.out.println("Enter Second Number");
            int b = sc.nextInt();

            if(operation == 1){
                System.out.println(a + b);
            }
            else if(operation == 2){
                System.out.println(a - b);
            }
            else{
                System.out.println(a * b);
            }







        }

        sc.close();

    }
}
