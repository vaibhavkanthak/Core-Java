package basic;

public class ClassConstants {

    public static final double PI = 3.14159;
    public static final int MAX_USERS = 100;
    public static final String APP_NAME = "Myjavaapp";

    public static void main(String[] args){

        System.out.println("Application Name: " + APP_NAME);
        System.out.println("Maximum Users Allowed: " + MAX_USERS);
        System.out.println("Value of PI: " + PI);

        // Example usage
        double radius = 5.0;
        double area = PI * radius * radius; // using the constant PI
        System.out.println("Area of Circle with radius " + radius + " = " + area);




    }
}
