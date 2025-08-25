package basic;

public class UnSignedByteDemo {

    public static void main(String[] args){
        byte b1 = 127;
        byte b2 = -128;
        byte b3 = -1;
        //Interpret sa Signed
        System.out.println("Signed values");
        System.out.println("b1 = " + b1);
        System.out.println("b1 = " + b2);
        System.out.println("b1 = " + b3);
        //Interpret as unsigned (0-255)
        System.out.println("\nUnsigned interpretation:");
        System.out.println("b1 = " + Byte.toUnsignedInt(b1));
        System.out.println("b2 = " + Byte.toUnsignedInt(b2));
        System.out.println("b3 = " + Byte.toUnsignedInt(b3));
        System.out.println();






    }
}
