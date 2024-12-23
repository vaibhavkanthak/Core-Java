public class MethodsEx06 {

    public static void main(String[] args){

        Point p = new Point();

        p.x = 5;
        p.y = 12;
        fun(p);
        System.out.println(p.x + " " + p.y);
    }
    public static void fun(Point p){
        p = new Point();
        p.x = 10;
        p.y = 24;
    }
}

class Point {
    int x, y;
}
