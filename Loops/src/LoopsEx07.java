//nested loops and break
public class LoopsEx07 {

    public static void main(String[] args){

        for(int i = 0; i < 2; i++){

            for(int j = 0; j < 2; j++){

                if(j == 1)
                    break;

                System.out.println(j);
            }
        }
    }
}
