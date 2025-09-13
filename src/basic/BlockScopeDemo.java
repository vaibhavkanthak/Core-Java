package basic;

public class BlockScopeDemo {
            public static void main(String[] args){
                int n = 10; // declare in main method
                System.out.println("n in main block = " + n);

                {
                    int k = 20;
                    System.out.println("Inside inner block k = " + k);
                    System.out.println("n is still accessible here = " + n);

                    // System.out.println(k); // ERROR: k is not visible outside its block
                    System.out.println("Back in main block, n = " + n);
                }
            }
}
