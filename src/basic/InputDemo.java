package basic;

import java.util.Scanner;

public class InputDemo {
        public static void main(String[] args){

            Scanner in = new Scanner(System.in);

            //get first input
            System.out.println("How old are you? ");
            int age = in.nextInt();
            in.nextLine();
            //System.out.println(age);

            System.out.println("What is your name? ");
            String name = in.nextLine();
            //System.out.println(name);
        }
}
