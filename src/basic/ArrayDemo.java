package basic;

public class ArrayDemo {
        public static void main(String[] args){
            // Declare an array variable
            int[] a;                //preferred style
            int b[];                //also allowed

            //Initialize an array with 5 elements
            a = new int[5];         // all values = 0 by default

            //Set values
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;

            //Print values
            for (int i = 0; i < a.length; i++){
                System.out.println("a[" + i + "] = " + a[i]);
            }

            int n = 3;
            int[] numbers = new int[n];             //length decided at runtime

            numbers[0] = 100;
            numbers[1] = 200;
            numbers[2] = 300;

            for(int num : numbers){
                System.out.println(num);
            }

            int[] smallPrimes = {2, 3, 5, 7, 11};
            for (int prime : smallPrimes){
                System.out.print(prime + " ");
            }

























        }
}
