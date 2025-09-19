package basic;

public class VarArgMethod {
        public static void main(String[] args){
            if (args.length == 0 || args[0].equals("-h")) {
                System.out.print("Hello,");
            } else if (args[0].equals("-g")) {
                System.out.print("Goodbye,");
            } else {
                System.out.print("Hello, " + args[0]);
            }
            System.out.println("!");
        }
}
