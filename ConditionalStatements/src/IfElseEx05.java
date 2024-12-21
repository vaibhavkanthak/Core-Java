import java.util.Scanner;

//Largest number of three numbers using Math.max method
public class IfElseEx05 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer1 = Math.max(a, b);
        int answer = Math.max(answer1, c);
        System.out.println(answer + " is largest number.");


    }
}
