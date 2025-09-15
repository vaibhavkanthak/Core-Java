package basic;

public class SwitchEnhancedDemo {
        public static void main(String[] args){
            String day = "MONDAY";

            String typeOfDay = switch(day){
                case "MONDAY", "TUESDAY", "WEDNSEDAY", "THURSDAY", "FRIDAY" -> "Weekday";
                case "SATURDAY", "SUNDAY" -> "Weekend";
                default -> "Invalid";
            };
            System.out.println(typeOfDay);

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





        }
}
