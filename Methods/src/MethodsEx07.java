//Command line arguments in java
public class MethodsEx07 {

    public static void main(String[] args){

        if(args.length > 0){

            System.out.println("Arguments are");
            for(String x: args){
                System.out.println(x + " ");
            }
        }
        else{
            System.out.println("No arguments");
        }
    }
}
