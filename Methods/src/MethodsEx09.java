import java.util.Scanner;
public class MethodsEx09 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("First digit of a given number is " + getFirstDigit(number));
    }
    public static int getFirstDigit(int number){
        double power = Math.log10(number);
        int a = (int) power;
        int b = (int) Math.pow(10, a);
        int num = number / b;
        return num;
    }
}
