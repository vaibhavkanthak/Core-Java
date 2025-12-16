package basic.data_type;
//Java program to demonstrate boolean primitive data types.
class MathExactDemo {

	public static void main(String[] args){

		//addExact
		try {
			int a = Integer.MAX_VALUE;
			int b = 1;
			int sum = Math.addExact(a, b);
			System.out.println("addExact result: " + sum);
		}catch (ArithmeticException e){
			System.out.println("addExact overflow detected");
		}
		//subtractExact
		try {
			int a = Integer.MIN_VALUE;
			int b = 1;
			int diff = Math.subtractExact(a , b);
			System.out.println("subtractExact result: " + diff);
		} catch (ArithmeticException e){
			System.out.println("subtractExact overflow detected");
		}
		//multipleExact
		try {
			int a = 50_000;
			int b = 50_000;
			int product = Math.multiplyExact(a, b);
			System.out.println("multiplyExact result: " + product);
		} catch(ArithmeticException e){
			System.out.println("multiplyExact overflow detected");
		}
		//incrementExact
		try{
			int x = Integer.MAX_VALUE;
			x = Math.incrementExact(x);
			System.out.println("incrementExact result: " + x);
		}catch (ArithmeticException e){
			System.out.println("incrementExact overflow detected");
		}
		//decrementExact
		try{
			int x = Integer.MIN_VALUE;
			x = Math.decrementExact(x);
			System.out.println("decrementExact result: " + x);
		}catch (ArithmeticException e){
			System.out.println("decrementExact overflow detected");
		}
		//negateExact
		try{
			int x = Integer.MIN_VALUE;
			x = Math.negateExact(x);
			System.out.println("negateExact result: " + x);
		}catch (ArithmeticException e){
			System.out.println("negateExact overflow detected");
		}
		//toIntExact (long -> int)
		try{
			long value = (long) Integer.MAX_VALUE + 1;
			int result = Math.toIntExact(value);
			System.out.println("toIntExact result: " + result);
		}catch (ArithmeticException e){
			System.out.println("toIntExact overflow detected");
		}



	}
}
