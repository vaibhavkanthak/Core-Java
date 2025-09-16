package basic;

public class WhileLoopDemo {
        public static void main(String[] args){
            int i = 1;
            while(i <= 5){
                System.out.println("Count: " + i);
                i++;
            }

            int x = 11;
            do{
                System.out.println("This runs at least once. x = " + x);
                x++;
            }while(x < 12);

            // for loop
            for(int j = 1; j <= 5; j++){
                System.out.println("j = " + j);
            }
            for(int a = 0; a <= 10; a++);{
                System.out.println("This runs once.");
            }

            // for each
            int[] arr = {10, 20, 30, 40, 50};
            for(int val : arr){
                System.out.println(val);

            }
            // break
            for(int b = 0; b < 10; b++){
                if(b == 5) break;
                System.out.println(b);
            }

            // continue
            for(int c = 1; c <= 10; c++){
                if(c == 4) continue;
                System.out.println(c);
            }
            int[] arr1 = {'a', 'b', 'c'};
            for(int value : arr1){
                System.out.println(value);
            }
            int num = 8;
            int z = 1;
            while(z <= 10){
                System.out.println(num + " * " + z + " = " + num * z);
                z++;
            }


        }
}
