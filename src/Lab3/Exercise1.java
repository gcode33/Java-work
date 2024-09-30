package Lab3;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        double far_temp = 0;
        int input_cnt = 0;
        double equiv_cel_temp = 0;
        double total_celcius = 0;
        double avg_cel_temp = 0;
        int cel_temp_lessthan = 0;
        int cel_temp_greaterthan = 0;
        int perc_celTemp=0 ;
        int percentage_cnt = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first Fahrenheit temperature(Below -459.67 to exit): ");
        far_temp = input.nextDouble();


        while (far_temp > -459.67) {

            input_cnt++;
            equiv_cel_temp = 5.0/9*(far_temp-32);
            total_celcius += equiv_cel_temp;
            avg_cel_temp = total_celcius/input_cnt;
            System.out.printf("the equivalent Celcius temperature is %.2f",equiv_cel_temp);

            if(equiv_cel_temp > 30){
                cel_temp_greaterthan+=1;
                if (equiv_cel_temp >= 20)
                {
                    percentage_cnt+=1;
                    perc_celTemp = (percentage_cnt/input_cnt)*100;

                }
            }
            else if (equiv_cel_temp < 10)
            {
                cel_temp_lessthan+=1;
            }

            System.out.print("\nPlease enter another Fahrenheit temperature(Below -459.67 to exit):  ");
            far_temp = input.nextDouble();



        }
        System.out.printf("total conversions preformed = %d\n " +
                "Average Celcuis temperature = %.3f\n " +
                "Total Celcius Temperatures > 30C = %d\n " +
                "Total Celcius Temperatures < 10C = %d\n " +
                "Total Percentage Temperatures >=20 = %d %%",input_cnt,avg_cel_temp,cel_temp_greaterthan,cel_temp_lessthan,perc_celTemp);
    }
}
