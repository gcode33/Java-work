package Lab3;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        double input_weight;
        double avg_weight=0;
        double total_weight=0;
        double heaviest = 0;
        double lightest = 1e30;
        double percentage = 0;
        int perc_cnt = 0;
        int input_cnt = 1;


        Scanner scanner = new Scanner(System.in);
       /* System.out.print("please enter the weight of Person 1: ");
        input_weight = scanner.nextDouble();
        input_cnt++;
        lightest = input_weight;*/

        while(input_cnt <= 5){

            System.out.printf("please enter the weight of Person %d: ",input_cnt);
            input_weight = scanner.nextDouble();

            total_weight+=input_weight;


            if(input_weight > heaviest){
                heaviest = input_weight;
            }
            if (input_weight< lightest){
                lightest = input_weight;
            }
            if(input_weight >= 80){
                perc_cnt++;

            }
            input_cnt++;



        }

        avg_weight = total_weight/input_cnt;
        percentage = ((float)perc_cnt/input_cnt)*100;

        System.out.printf("\n\n\n\t\t\t*****************\n"+
                "\t\t\tProgram Results\n"+
                "\t\t\t****************");

        System.out.printf("\nAverage weight: %.2fkg\n" +
                "Percentage >= 80kg %.2f %%\n" +
                "Heaviest Weight: %.2fkg\n" +
                "Lightest Weight: %.2fkg ", avg_weight,percentage,heaviest,lightest);
    }
}
