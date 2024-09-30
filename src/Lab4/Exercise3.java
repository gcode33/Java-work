package Lab4;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a upper limit: ");
        num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {

            sum = sum+i;


        }
        System.out.printf("the sum of the first %d positive numbers is %d ",num,sum);

    }
}

