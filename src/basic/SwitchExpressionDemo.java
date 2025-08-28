package basic;

public class SwitchExpressionDemo {
        public static void main(String[] args){

            int seasonCode = 2;
            //Switch expression introduced in Java 14
            String seasonName = switch (seasonCode){
                case 0 -> "Spring";
                case 1 -> "Summer";
                case 2 -> "Fall";
                case 3 -> "Winter";
                default -> "???"; //fallback for invalid coders

            };

            System.out.println("Season code: " + seasonCode);
            System.out.println("Season name: " + seasonName);
        }
}
