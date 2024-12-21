// JAVA program to find sum of first
// n natural numbers.


import java.io.*;
import java.util.Scanner;

class OperatorsEx5 {
    // Driver code
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
       int x = sc.nextInt();
        int sum = 0;
//
//        for (int x = 1; x <= n; x++)
//            sum = sum + x;
        sum = x*(x+1)/2;
        System.out.println(sum);
    }
}