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

            String[] authors = {
                    "James Gosling",
                    "Bill Joy",
                    "Guy Steele", // trailing comma allowed
            };

            for (String name : authors) {
                System.out.println(name);
            }

            int[] count = {1, 2, 3};
            System.out.println("Original:");
            for (int n1 : count) System.out.print(n1 + " ");

            // Reinitialize with new values using anonymous array
            count = new int[] {100, 200, 300, 400};
            System.out.println("\nAfter Reinitialization:");
            for (int n1 : count) System.out.print(n1 + " ");
            System.out.println();
            // Pass anonymous array directly

            printArray(new int[] {11, 22, 33, 44});
        }
        static void printArray(int[] arr){
            for (int num : arr){
                System.out.print(num + " ");
            }
        }
}
