package basic;

public class DataType {
        public static void main(String[] args){

            int a = 2_000_000_000;
            int b = 2_000_000_000;
            int c = a + b; //overflowed and wrapped within range of int.
            System.out.println(c);

            int x = 50_000;
            int y = 50_000;
            int z = x * y;
            System.out.println(z); //overflowed and so wrapped within range of int.
        }
}
