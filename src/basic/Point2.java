//Reference behaviour of non-primitive types
package basic;
class Test{

	int x;
	int y;
}
public class Point2{

	public static void main(String[] args){

	Test t1 = new Test();
	
	t1.x = 10;
	t1.y = 20;

	Test t2 = t1;
	t2.x = 30;

	System.out.println("t1.x: " + t1.x);
	System.out.println("t2.x: " + t2.x);

	}
}
