package basic;

public class SwitchEnhancedDemo {
        public static void main(String[] args){
            //1.
            String day = "MONDAY";

            String typeOfDay = switch(day){
                case "MONDAY", "TUESDAY", "WEDNSEDAY", "THURSDAY", "FRIDAY" -> "Weekday";
                case "SATURDAY", "SUNDAY" -> "Weekend";
                default -> "Invalid";
            };
            System.out.println(typeOfDay);
            //2.
            int number = 2;

            String result = switch (number) {
                case 1 -> "One";
                case 2 -> {
                    System.out.println("Processing...");
                    yield "Two";   // returns value from this block
                }
                default -> "Other";
            };

            System.out.println(result);
            //3.
            String season = "Spring";

            int numLetters = switch (season) {
                case "Spring" -> {
                    System.out.println("spring time!");
                    yield 6;  // must yield value
                }
                case "Fall" -> 4;
                default -> -1;
            };

            System.out.println("Letters = " + numLetters);






        }
}
