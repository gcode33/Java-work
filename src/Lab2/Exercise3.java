package Lab2;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        double porb_rad;
        double days;
        double G = 6.67428E-11;
        double pi = 3.142;
        double pi_sqrd = pi*pi;
        double rad_cubed;
        double T;
        double mass;
        double T_sqrd;

        Scanner input = new Scanner(System.in);
        System.out.print("--------------Sun Mass Calculator-----------");
        System.out.print("\nPlease enter the radius of the planets orbit around the sun: ");
        porb_rad = input.nextDouble();
        if(porb_rad<0){
            System.out.print("Error! the period of rotation must be positve.....Quitting program now");
            return;
        }
        System.out.print("Please enter the period of rotation for the planet in days: ");
        days = input.nextDouble();
        if(days < 0){
            System.out.print("Error! the number of days must be positve.....Quitting program now");
            return;
        }
        T = days*86400;
        T_sqrd = T*T;
        rad_cubed = porb_rad*porb_rad*porb_rad;
        mass = 4*pi_sqrd*rad_cubed/(G*T_sqrd);
        System.out.printf("there are %.1f seconds in %.2f days", T,days);
        System.out.printf("\nThe approx mass of the sun is %.1f kg",mass);




    }
}
