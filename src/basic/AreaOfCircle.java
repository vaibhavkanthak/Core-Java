package arithmetic;

public class AreaOfCircle {

    private static final double radius = 7.5;

    public static void main(String[] args){

        double areaOfCircle = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of Circle " + areaOfCircle);
        System.out.println("Perimeter of Circle " + perimeter);

    }
}
