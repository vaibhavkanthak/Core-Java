//Check if a string contains only digits
package practice;
public class Practice46 {
        public static void main(String[] args){
            String str = "12345";
            boolean isNumeric = true;

            for(int i = 0; i < str.length(); i++){
                if(!Character.isDigit(str.charAt(i))){
                    isNumeric = false;
                    break;
                }

            }
            if(isNumeric){
                System.out.println("String contains only digits");
            }else{
                System.out.println("String contains non-digit characters");
            }
        }
}
