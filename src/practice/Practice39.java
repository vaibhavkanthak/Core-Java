//Reverse a string manually (without built-in reverse)
package practice;
public class Practice39 {
        public static void main(String[] args){
            String str = "Java";
            String reversed = "";
            System.out.println(str.length());

            for(int i = str.length() - 1; i >= 0; i--){
                reversed += str.charAt(i);
            }
            System.out.println("Reversed String: " + reversed);

        }
}
