package basic;
import java.util.Arrays;
public class InvestmentSimpleDemo {
        public static void main(String[] args){
            double investment = 10000;
            double[] rates = {0.10, 0.12, 0.15};
            int years = 5;

            //Make a 2D array: rows = rates, cols = years + 1
            double[][] table = new double[rates.length][years + 1];

            //Fill the table
            for(int i = 0; i < rates.length; i++){
                table[i][0] = investment;
                for(int j = 1; j <= years; j++){
                    table[i][j] = table[i][j -1] * (1 + rates[i]);
                }
            }
            //Print header(years)
            System.out.printf("%10s", "Year");
            for(int j = 0; j <= years; j++){
                System.out.printf("%12d", j);
            }
            System.out.println();

            //Print rows (rates)
            for(int i = 0; i < rates.length; i++){
                    System.out.printf("%9.0f%%", rates[i] * 100);
                for(int j = 0; j <= years; j++){
                    System.out.printf("%12.2f", table[i][j]);
                }
                System.out.println();
            }


        }

}
