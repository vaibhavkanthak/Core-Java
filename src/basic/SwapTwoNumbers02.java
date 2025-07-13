package basic;

public class SwapTwoNumbers02 {

    public static void main(String[] args){

        int a, b;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = " + a + ", " + b);
        a = a + b;  // Add a and b and store the result in a
        b = a - b;  // Subtract the original b from the new a and store the result in b
        a = a - b;  // Subtract the new b from the updated a and store the result in a

        System.out.println("After swapping : a, b = " + a + ", " + b);

    }
}

