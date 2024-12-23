public class MethodsEx04 {

    public static void main(String[] args){

        int x = 5, y = 12;
        System.out.println(getMax(x, y));
    }

    public static int getMax(int x, int y){

        if(x > y)
            return x;
        else
            return y;
    }
}
