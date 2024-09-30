package Lab1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[]args){

        String inv1;
        String inv2;
        int num_shares1;
        int num_shares2;
        double sp1;
        double sp2;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the type of fund: ");
        inv1 = input.nextLine();

        System.out.print("Please enter the type of investment fund: ");
        inv2 = input.nextLine();

        System.out.print("Please enter the share price: ");
        sp1 = input.nextDouble();

        System.out.print("please enter the share price: ");
        sp2 = input.nextDouble();

        System.out.print("Please enter the number of shares: ");
        num_shares1 = input.nextInt();


        System.out.print("please enter the number of shares: ");
        num_shares2 = input.nextInt();



        System.out.println("\n\n\n\t\t\t*****************\n"+
                "\t\t\tInvestment Details\n"+
                "\t\t\t****************");


        System.out.println(String.format("%-20s%-15s%s\n%-20s%-15s%s",
                "Investment Type", "# of shares", "Share price",
                "***************","************","************"));

        System.out.println(String.format("%-20s%-15d%.4f\n%-20s%-15d%.4f",
                inv1,num_shares1,sp1,inv2,num_shares2,sp2));

    }
}
