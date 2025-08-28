package basic;

public class strictmathDemo {
        public static void main(String[] args){

            double angle = 45.0;
            double radians = Math.toRadians(angle);

            System.out.println("Angle in degrees: " + angle);
            System.out.println("Angle in radians: " + radians);

            //Using Math
            double mathSin = Math.sin(radians);
            double mathCos = Math.cos(radians);
            double mathPow = Math.pow(2,10);

            System.out.println("\n--- Using Math ---");
            System.out.println("sin(45°): " + mathSin);
            System.out.println("cos(45°): " + mathCos);
            System.out.println("2^10: " + mathPow);

            //Using strictMath class
            double strictSin = StrictMath.sin(radians);
            double strictCos = StrictMath.cos(radians);
            double strictPow = StrictMath.pow(2, 10);

            System.out.println("\n--- Using StrictMath ---");
            System.out.println("sin(45°): " + strictSin);
            System.out.println("cos(45°): " + strictCos);
            System.out.println("2^10: " + strictPow);


            // Demonstrating reproducibility: Math vs StrictMath may differ slightly
            System.out.println("\nDifference in sin(45°): " + (mathSin - strictSin));
            System.out.println("Difference in cos(45°): " + (mathCos - strictCos));
        }
}
