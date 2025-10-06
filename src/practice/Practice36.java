package practice;
public class Practice36 {
    public static void main(String[] args) {
        int limit = 100;
        boolean[] isPrime = new boolean[limit + 1];

        // Step 1: Assume all numbers >= 2 are prime
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        // Step 2: Mark multiples of each prime as non-prime
        for (int num = 2; num * num <= limit; num++) {
            if (isPrime[num]) {
                for (int multiple = num * num; multiple <= limit; multiple += num) {
                    isPrime[multiple] = false;
                }
            }
        }

        // Step 3: Print all primes
        System.out.println("Prime numbers between 1 and 100:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i])
                System.out.print(i + " ");
        }
    }
}