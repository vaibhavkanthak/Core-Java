//Merge two arrays
package practice;
public class Practice88 {
        public static void main(String[] args){
            int[] a = {1, 3, 5};
            int[] b = {2, 4, 6};

            int[] merged = new int[a.length + b.length];
            int k = 0;

            for(int num : a){
                merged[k++] = num;
            }
            for(int num : b){
                merged[k++] = num;
            }
            System.out.print("merged array: ");
            for(int num : merged){
                System.out.print(num + " ");
            }

        }
}
