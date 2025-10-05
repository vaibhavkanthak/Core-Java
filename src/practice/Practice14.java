//Find greatest of three numbers using logical operators
package practice;
public class Practice14 {
        public static void main(String[] args){
            int a = 23, b = 45, c = 11;
            if(a >= b && a >= c){
                System.out.println("Greatest number is: " + a);
            }else if(b >= a && b >= c){
                System.out.println("Greatest number is: " + b);
            }else
                System.out.println("Greatest number is: " + c);
        }
}
