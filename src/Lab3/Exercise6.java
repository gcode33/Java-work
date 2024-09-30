package Lab3;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        double rate = 0.03, balance = 100000, profit = 12000;

        int year = 1;
        //balance += (balance * rate) / 100;
        //new_balance = balance - 12000;

        while (balance>= 12000)
        {
            balance += (balance * rate) - profit;

            System.out.printf("Balance at the end of year %d is EUR %.2f\n", year, balance);
            year++;
        }
    }
}
