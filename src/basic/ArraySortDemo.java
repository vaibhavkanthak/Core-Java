package basic;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraySortDemo {
        public static void main(String[] args){
           Scanner in = new Scanner(System.in);

           System.out.println("How many numbers do you want to draw?");
           int k = in.nextInt();

           System.out.println("What is the highest number you can draw?");
           int n = in.nextInt();

           if(k < 0 || n <= 0){
               System.out.println("k must be >= 0 and n must be > 0");
           }
           if (k > n){
               System.out.println("Cannot draw " + k + "distinct numbers from 1.." + n);
           }

           //Fill an array with 1...n
           int[] numbers = new int[n];
           for (int i = 0; i < n; i++){
               numbers[i] = i + 1;
           }

           //Draw k numbers without replacement
            int[] result = new int[k];
           int poolSize = n;
           for(int i = 0; i < k; i++){
               int r = ThreadLocalRandom.current().nextInt(poolSize);
               result[i] = numbers[r];
               numbers[r] = numbers[poolSize - 1];
               poolSize--;
           }

           Arrays.sort(result);
           System.out.println("Bet the following combination. It'll make you rich!");
           for(int r: result){
               System.out.println(r);
           }

           /*
           Alternate Method
           import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            public class LotteryUsingShuffle {
                    public static void main(String[] args) {
                    int n = 49, k = 6;
                    List<Integer> list = new ArrayList<>(n);
                    for (int i = 1; i <= n; i++) list.add(i);

                    Collections.shuffle(list);          // Fisher-Yates under the hood
                    List<Integer> combo = list.subList(0, k);
                    Collections.sort(combo);
                    System.out.println(combo);
                        }
                    }
            */

        }
}
