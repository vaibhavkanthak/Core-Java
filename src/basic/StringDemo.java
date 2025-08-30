//Create String Objects using String literals
package basic;

public class StringDemo {
        public static void main(String[] args){

            //String creation using literals
            String s1 = "geeks";
            String s2 = "geeks";

            //Comparing string literals
            if(s1 == s2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            //String creation using new keyword
            String s3 = new String("geeks");

            //Comparing literal with object created using new

            if(s1 == s3){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            String s4 = "geek";
            System.out.println(s1.contains(s4));
        }

}
