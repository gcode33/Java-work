package Problem_solving_1;

import java.util.Scanner;

public class ExerciseB {
    public static void main(String[]args){
        double mass;
        double velocity;
        double vel_sqrd;
        double kin_energy;
        double half_val = 0.5;

        Scanner input = new Scanner(System.in);

        System.out.print("please enter the mass of the object: ");
        mass = input.nextDouble();

        System.out.print("please enter the velocity of the object: ");
        velocity = input.nextDouble();
        vel_sqrd = velocity*velocity;
         kin_energy = half_val*(mass*vel_sqrd);

        System.out.println("\n\n\n\t\t\t*****************\n"+
                "\t\t\tResults\n"+
                "\t\t\t****************");

        System.out.printf("Mass: %.3f kg\nvelocity: %.3f m/s\nkinetic energy: %.3f J",mass,velocity,kin_energy);

    }
}
