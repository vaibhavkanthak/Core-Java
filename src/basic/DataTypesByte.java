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
	}
}
		