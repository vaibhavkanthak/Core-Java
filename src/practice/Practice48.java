//Find the largest and smallest element in an array
package practice;
public class Practice48 {
        public static void main(String[] args){
            int[] arr = new int[5];
            arr[0] = 23;
            arr[1] = 11;
            arr[2] = 45;
            arr[3] = 89;
            arr[4] = 10;

            int largest = arr[0];
            int smallest = arr[0];

            for(int i = 1; i < arr.length; i++){
                if(arr[i] > largest) largest = arr[i];
                if(arr[i] < smallest) smallest = arr[i];
            }
            System.out.println("Largest: " + largest);
            System.out.println("smallest: " + smallest);
        }
}
