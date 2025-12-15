//Calculate area and perimeter of a rectangle.
package practice;

public class Practice05 {
        public static void main(String[] args){
            double length = 10.5, width = 4.2;
            double perimeter = 2 * (length + width);
            double area = length * width;
            System.out.println("Area of rectangle is " + area + " perimeter of rectangle is " + perimeter);
        }
}
