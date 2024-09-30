package Lab2;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[]args){
        String meter, septic, pws;
        int aFee = 212;
        int Liters_used;
        double rate = 0.224;
        int allowance = 30000;
        double fee;


        Scanner input = new Scanner(System.in);

        System.out.print("Do you have a private water supply(y or n): ");
        pws = input.nextLine();

        System.out.print("Do you have a septic tank(y or n): ");
        septic = input.nextLine();
        if(pws.equals("y") && septic.equals("y")){
            System.out.print("You are not a customer of irish water so your bill is $0.00");
            return;
        }

        System.out.print("Do you have a water meter installed(y or n): ");
        meter = input.nextLine();

        if (pws.equals("y") && septic.equals("n") && meter.equals("y")){
            System.out.print("Please enter the number of liters used last year: ");
            Liters_used = input.nextInt();
            fee = (Liters_used-allowance)*rate;
            System.out.printf("your annual bill for Irish Water services is $%.2f",fee);

        }
        else if (pws.equals("n") && septic.equals("y") && meter.equals("y")){
            System.out.print("Please enter the number of liters used last year: ");
            Liters_used = input.nextInt();
            fee = (Liters_used-allowance)*rate;
            System.out.printf("your annual bill for Irish Water services is $%.2f",fee);

        }
        else if (pws.equals("n") && septic.equals("n") && meter.equals("y")){
            System.out.print("Please enter the number of liters used last year: ");
            Liters_used = input.nextInt();
            fee = (Liters_used-allowance)*rate;
            System.out.printf("your annual bill for Irish Water services is $%.2f",fee);

        }
        else{
            System.out.print("Awkward.........Anyways bye!");
        }

    }
}
