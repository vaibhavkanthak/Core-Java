package basic;

public class SwitchDemo {
        public static void main(String[] args){
            /*
            switch(expression){
            case value 1 : statements break;
            case value 2 : statements break;
            case value 3 : statements break;
            default : statements;
             */
            int day = 3;
            String dayName;

            switch (day) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Invalid day";
            }

            System.out.println("Day = " + dayName);


        }
}
