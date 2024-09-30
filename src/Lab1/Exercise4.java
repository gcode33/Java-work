package Lab1;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[]args){

        double g_temp;
        double moles;
        double gas_p;
        double g_volume;
        Double R = 8.3145;
        char unit = 179;

        Scanner input = new Scanner(System.in);

        System.out.print("please enter the Temperature of the gas: ");
        g_temp = input.nextDouble();

        System.out.print("Please enter the number of moles of the gas: ");
        moles = input.nextDouble();

        System.out.print("Please enter the pressure of the gas: ");
        gas_p = input.nextDouble();

        g_volume = (moles*R*g_temp)/gas_p;

        System.out.printf("the volume of gas is: %.3f m%c",g_volume,unit);
    }
}
