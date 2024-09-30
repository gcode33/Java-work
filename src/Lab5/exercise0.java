package Lab5;
import java.util.Scanner;
public class exercise0 {
    public static void main(String[]args){
        double ini_speed, acc, time;

        Scanner input = new Scanner(System.in);
        System.out.print("enter the firsst speed");
        ini_speed = input.nextDouble();

        System.out.print("enter the firsst acceleration");
        acc = input.nextDouble();

        System.out.print("enter the firsst time");
        time = input.nextDouble();

        System.out.println("\n\n the distance traveled by the object is: "+ String.format("%.3f n",distance(ini_speed,acc,time)));
    }
    public static double distance( double u, double a, double t){
        return u*t+0.5*a*t*t;
    }

}
