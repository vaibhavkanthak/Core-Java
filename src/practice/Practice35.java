//Display right-angled triangle pattern
package practice;
public class Practice35 {
        public static void main(String[] args){
            for(int i = 1; i <= 5; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
}
