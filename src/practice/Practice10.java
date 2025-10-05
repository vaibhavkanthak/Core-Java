//Calculate Simple Interest and Compound Interest
package practice;

public class Practice10 {
        public static void main(String[] args){
            double principal = 25_00_000;
            double rate = 7.5;
            double year = 10;

            double simpleInterest = (principal * rate * year) / 100;
            double compoundInterest = principal * Math.pow((1 + rate / 100), year) - principal;

            System.out.println("Simple Interest: " + simpleInterest);
            System.out.println("Compound Interest: " + compoundInterest);
        }
}
