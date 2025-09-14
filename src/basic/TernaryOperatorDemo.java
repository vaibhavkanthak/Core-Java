package basic;

public class TernaryOperatorDemo {
        public static void main(String[] args){
            //result = (condition) ? valueIfTrue : valueIfFalse;
            int age = 20;
            String result;

            if (age >= 18) {
                result = "Adult";
            } else {
                result = "Minor";
            }

            System.out.println(result);

            int marks = 90;
            String grade = (marks >= 90) ? "Grade A" : "Average";
            System.out.println(grade);


        }
}
