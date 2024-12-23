//Print Prime factorization of given number.
import java.util.Scanner;
public class MethodsEx10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        getPrimeFactorization(number);
    }
    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void getPrimeFactorization(int number){
        for(int i = 2; i < number; i++){
            if( isPrime(i)){
                int x = i;
                while(number % x == 0){

                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }

    }
}
