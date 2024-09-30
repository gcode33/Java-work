package Lab1;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[]args){

        int num_oz = 0;
        int lbs = 16;
        int r_oz = 0;
        int avg_lbs = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("please enter the amount of ounces: ");
        num_oz = input.nextInt();

        avg_lbs = num_oz/lbs;

        r_oz = num_oz%lbs;

        System.out.print(String.format("%doz is equivilant to %dlbs %doz",num_oz,avg_lbs,r_oz ));




    }
}
