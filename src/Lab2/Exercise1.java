package Lab2;
import java.util.Scanner;
import java.lang.Math;

public class Exercise1 {
    public static void main(String[]args){
        float bvolt;
        int r1;
        int r2;
        float curr;
        int curr_A;

        Scanner input = new Scanner(System.in);
        System.out.print("--------------Current Calculator-----------");
        System.out.print("\nPlease enter the Voltage of the first battery: ");
        bvolt = input.nextFloat();
        if(bvolt < 0){
            System.out.print("Error the voltage of the battery must be positive ..... now quitting the program");
            return;
        }

        System.out.print("Please enter the resitance of the first resistor: ");
        r1 = input.nextInt();

        System.out.print("Please enter the value of the second resistor: ");
        r2 = input.nextInt();


        curr = Math.round(bvolt * (r1 + r2) / (r1 * r2));
        System.out.printf("The total current flowing into the circuit is %.1f amps",curr);

    }
}
