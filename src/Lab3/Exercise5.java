package Lab3;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        String input_string;


        int cnt = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        input_string = scanner.nextLine();

        while (cnt < input_string.length()) {
            char ch = input_string.charAt(cnt);
            if (!Character.isDigit(ch)) {
                System.out.print("\nyou did not enter a positve whole number");
                return;
            }
           cnt++;
        }

        System.out.print("\nyou did enter a positive Whole number");
    }
}
