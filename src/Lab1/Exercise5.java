package Lab1;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[]args){

        Double grv = 9.81;
        double e_mass;
        double e_radius;
        double p_mass;
        double p_radius;
        double acc;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the mass of planet earth: ");
        e_mass = input.nextDouble();

        System.out.print("Please enter the radius of planet earth: ");
        e_radius = input.nextDouble();

        System.out.print("Please enter the mass of the other planet : ");
        p_mass = input.nextDouble();

        System.out.print("Please enter the radius of the other planet : ");
        p_radius = input.nextDouble();

        double ert = e_radius*e_radius;
        double prt = p_radius*p_radius;

        acc = grv*p_mass*ert/(e_mass*prt);

        System.out.printf("the Acceleration due to gravity on the other planet is %.2f m/s/s",acc);
    }
}
