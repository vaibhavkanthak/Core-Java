package basic;

public class NestedIfDemo {
    public static void main(String[] args){
        int number = -10;

        if (number >= 0) {
            if (number == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Positive");
            }
        } else {
            System.out.println("Negative");
        }
    }
}
