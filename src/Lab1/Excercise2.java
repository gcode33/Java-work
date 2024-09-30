package Lab1;
import java.util.Scanner;
public class Excercise2 {
    public static void main(String[]args){

        String Pname;
        double O_speed;
        int num_moons;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the name of the planet: ");
        Pname = input.nextLine();

        System.out.print("please enter the orbital speed of the planet: ");
        O_speed = input.nextDouble();

        System.out.print("Please enter the number of moons: ");
        num_moons = input.nextInt();


        System.out.println("\n\n\n\t\t*****************\n"+
                "\t\t\tPlanet Data\n"+
                "\t\t****************");


        System.out.printf("Planet Name: %s\nOrbital Speed: %.3f\nNumber of Moons: %d",Pname,O_speed,num_moons);
    }
}
