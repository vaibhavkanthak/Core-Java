package basic;

public class TernaryOperatorDemo2 {
        public static void main(String[] args){
            int marks = 72;
            String grade = (marks >= 90) ? "A+" : (marks >= 75) ? "A" : (marks >= 60) ? "B" : "Fail";
            System.out.println(grade);

        }
}
