//Using xxxValue() methods
package basic;

public class WrapperDemo4 {
    public static void main(String[] args){
        Integer obj = Integer.valueOf(25);

        int i = obj.intValue();
        double d = obj.doubleValue();
        float f = obj.floatValue();

        System.out.println("int value: " + i);
        System.out.println("double value: " + d);
        System.out.println("float value: " + f);
    }
}
