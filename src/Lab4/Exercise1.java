package Lab4;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        double number;
        String choice;
        double ans = 0;
        double remainder_inch =0;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("\n 1. Convert Inches to feet and Inches\n " +
                    "2. Convert meters to feet\n " +
                    "3. Quit \n");

            System.out.print("\nplease enter your choice: ");
            choice = scanner.nextLine();


            //  while (!choice.equals("")) {

            while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                System.out.print("invalid choice please enter a choice again: ");
                choice = scanner.nextLine();

            }

            if (choice.equals("1")) {
                System.out.print("Please enter a quantity in inches: ");
                number = scanner.nextDouble();
                while (number < 0) {
                    System.out.print("invalid quantity! must be at least zero. please re-enter: ");
                    number = scanner.nextDouble();
                }

                ans = number / 12;
                remainder_inch = number % 12;
                System.out.printf("\n%.2f inches is equivalent to %.4f feet %.4f inches\n", number, ans, remainder_inch);
                //return;


            } else if (choice.equals("2")) {
                System.out.print("Please enter a quantity in meters: ");
                number = scanner.nextDouble();
                while (number < 0) {
                    System.out.print("invalid quantity! must be at least zero. please re-enter: ");
                    number = scanner.nextDouble();
                }

                {
                    ans = number / 0.3048;
                    System.out.printf("\n%.2f meters is equivalent to %.4f feet\n", number, ans);
                    //return;
                }


            } else {
                System.out.print("you chose to quit thank you for using this application");
                return;
            }

            scanner.nextLine();

        }while(!choice.equals("3"));



    }
}
