// continue in while loop
public class LoopsEx05 {

    public static void main(String[] args){

        int i = 0;
        while (i < 5){

            System.out.println("Before " + i);
            i++;
            if(i == 3)
                continue;
            System.out.println("After " + i);


        }
    }
}
