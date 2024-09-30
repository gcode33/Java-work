package Lab2;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double hrs_p;
        double cost = 0;
        double half_hrs = 0.25;
        double hrs1 = 0.60;
        double hrs2 = 0.50;
        double more_hrs = 0.40;


        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\n\t\t=================================\n"+
                "\t\t\tCar park Calculator\n"+
                "\t\t=================================");
        System.out.print("Pleas enter the number of hours parked: ");
        hrs_p = input.nextDouble();

        if(hrs_p < 0){
            System.out.print("Error: you have entered an invalid time value...... exiting program");
            return;
        }
        else if (hrs_p>0 && hrs_p<1) {
            cost = cost+half_hrs+hrs1;
            System.out.printf("The total cost of parking %.1f hours is %.2f$",hrs_p,cost);

        }
        else if (hrs_p == 1) {
            cost = cost+hrs1;
            System.out.printf("The total cost of parking %.1f hours is %.2f$",hrs_p,cost);
        }
        else if(hrs_p>1 && hrs_p<2 ){
            cost = cost +hrs1+hrs2+half_hrs;
            System.out.printf("The total cost of parking %.1f hours is %.2f$",hrs_p,cost);

        } else if (hrs_p > 3) {
            cost = cost +hrs1+hrs2+hrs2+more_hrs+half_hrs;
            System.out.printf("The total cost of parking %.1f hours is %.2f$",hrs_p,cost);

        }
    }
}