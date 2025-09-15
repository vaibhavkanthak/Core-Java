package basic;

public class SwitchDemo1 {
        public static void main(String[] args){
            int number = 2;

            switch (number) {
                case 1:
                    System.out.println("One");
                case 2:
                    System.out.println("Two");   // runs
                case 3:
                    System.out.println("Three"); // runs too (fall-through!)
            }

            char grade = 'B';

            switch (grade) {
                case 'A':
                case 'B':
                case 'C':
                    System.out.println("Pass");
                    break;
                case 'D':
                case 'F':
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Invalid grade");
            }
            String fruit = "Apple";

            switch (fruit) {
                case "Apple":
                    System.out.println("It's red");
                    break;
                case "Banana":
                    System.out.println("It's yellow");
                    break;
                default:
                    System.out.println("Unknown fruit");
            }

        }
}
