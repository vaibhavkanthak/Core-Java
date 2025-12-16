package basic.data_type;
//Java program to demonstrate Byte Data type
class DataTypesByte{
		
		public static void main(String[] args){

		byte b = 126;
		System.out.println(b);
		b++;
		System.out.println(b);

		// It overflows here because
		// byte can hold values from -128 to 127
		b++;
		System.out.println(b);
		//Looping back within the range.
		b++;
		System.out.println(b);

		boolean value;
		value = false;
		System.out.println("value is " + value);
		value = true;
		System.out.println("value is " + value);

		// a boolean value can control the if statement
		if(value) System.out.println("This is executed.");

		value = false;
		if(value) System.out.println("This is not executed.");

		System.out.println("10 > 9 is " + (10 > 9));

	}
}
