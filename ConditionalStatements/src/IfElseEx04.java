//Largest of three numbers using if else

import java.util.Scanner;
public class IfElseEx04 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){

            System.out.println( a + " is largest number");
        }
        else if(b > a && b > c){

            System.out.println(b + " is largest number.");
        }
        else{

            System.out.println(c + " is largest number");
        }
    }
}
