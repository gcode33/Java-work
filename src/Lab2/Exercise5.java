package Lab2;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("please enter a single keyboard character: ");
        char key_char;//= input.next().charAt(0);
        String in = input.nextLine();


        if(in.length() != 1){

            if(in.length() == 0)
                System.out.print("Error! the value entered has no characters ");
            else
                System.out.print("Error! the value entered must contain only one character ");

            return;
        }
        else {

                key_char = in.charAt(0);

                if (Character.isLowerCase(key_char)) {
                    System.out.print("The category of character entered is: Lowercase letter");
                    return;
                }
                else if (Character.isUpperCase(key_char))
                {
                    System.out.print("The category of character entered is: Uppercase letter");
                    return;
                }
                else if (key_char =='$' || key_char == '€'||key_char == '£')
                {
                    System.out.print("The category of character entered is: Currency symbol");
                    return;
                }
                else if (Character.isWhitespace(key_char))
                {
                    System.out.print("The category of character entered is: White space character");
                    return;

                }
                else
                {
                    System.out.print("The category of character entered is: Unidentified");
                    return;
                }
        }

    }
}
