package arithmetic;

public class AreaOfRectangle {

        static final double width = 5.6;
        static final double height = 8.5;

    public static void main(String[] args){

        double perimeter = 2 * (width + height);
        double areaOfRectangle = width * height;

        System.out.println("Perimeter of Rectangle " + perimeter);
        System.out.println("Area of Rectangle " + areaOfRectangle);


    }
}
