package basic.data_type;
//Java program to illustrate float primitive data type.
class DataTypesFloat{
		
		public static void main(String[] args){
		
		float value = 3.14f;
		System.out.println(value);
		double x = Double.MAX_VALUE;
		System.out.println(x * 2);

		System.out.println(1.0 / 0.0);   // Infinity
		System.out.println(0.0 / 0.0);   // NaN



	}
}

/*
Why floating-point overflow behaves differently
Core reason:
Java floating-point (float, double) follows the IEEE-754 standard,
not simple two’s-complement integer arithmetic.
Key differences at JVM / hardware level

1️⃣ Special values exist
Floating-point has Infinity and NaN.
	•	Integer types do not.
	•	So instead of wrapping, results can become:
	•	+Infinity
	•	-Infinity
	•	NaN
2️⃣ No fixed “wrap-around” range
	•	Integers: fixed bits → overflow → bits truncated → wrap.
	•	Floating-point: value is stored as sign + exponent + mantissa.
	•	When exponent exceeds its limit → Infinity, not wrap.
3️⃣ IEEE-754 mandates behavior
The JVM must follow IEEE-754 rules:
	•	Overflow → ±Infinity
	•	Invalid operation → NaN
	•	Division by zero:
	•	Integer → ArithmeticException
	•	Floating-point → Infinity or NaN
4️⃣ No exceptions for performance
	•	Floating-point math is heavily used in:
	•	graphics
	•	scientific computing
	•	ML
	•	Throwing exceptions would be expensive.
	•	Propagating Infinity/NaN is faster and predictable.

 */