//changing static variable via another object 
package basic;
public class ScopeOfVariables01{
		
		static int x = 100;
		private int y = 200;
		
	public void changeValues(){

		x = x + 10;
		y = y + 10;

		}

	public static void main(String[] args){
		
		ScopeOfVariables01 obj1 = new ScopeOfVariables01();
		ScopeOfVariables01 obj2 = new ScopeOfVariables01();

		obj1.changeValues();		
		
		System.out.println("obj1.x: " + obj1.x);
		System.out.println("obj2.x: " + obj2.x);

		System.out.println("obj1.y: " + obj1.y);
		System.out.println("obj2.y: " + obj2.y);
	}
}
