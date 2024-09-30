package Lab6;
import javax.swing.*;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[]args){
        String ISBN, validISBNs = "", startsWith865 = "", prompt;

        ISBN = JOptionPane.showInputDialog("Please enter an ISBN (return to exit)");

        while(!ISBN.equals("")) {

            prompt = Valid_isbn(ISBN);

            while(!prompt.equals("valid")) {

                ISBN = JOptionPane.showInputDialog(prompt + " Please re-enter ISBN (return to exit)");

                if(ISBN.equals(""))
                    break;

                prompt = Valid_isbn(ISBN);
            }

            if(!ISBN.equals("")) {

                validISBNs += ISBN + "\n";

                if (ISBN.startsWith("865"))
                    startsWith865 += ISBN + "\n";
            }

            ISBN = JOptionPane.showInputDialog("Please enter another ISBN (return to exit)");
        }

        if(!validISBNs.equals(""))
            JOptionPane.showMessageDialog(null,"The valid ISBNs entered are: \n\n" + validISBNs +
                            "\n\nThe ISBNs that begin with 865 are: \n\n" + startsWith865,
                    "Valid ISBNs",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"You entered no valid ISBNs .... thanks for using the system",
                    "No valid ISBNs",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static String Valid_isbn(String ISBN){
        if(ISBN.length() != 10)
            return "Invalid! ISBN must have exactly 10 characters.";

        for(int i = 0; i <= 8; i++)
            if(!Character.isDigit(ISBN.charAt(i)))
                return "Invalid! First 9 characters must be digits.";

        if(!Character.isDigit(ISBN.charAt(9)) && ISBN.charAt(9) != 'X' && ISBN.charAt(9) != 'x')
            return "Invalid! Last character must be a digit, an 'X' or an 'x'.";

        int sum = 0;
        int lastCharAsInt;

        for (int j = 0; j <= 8; j++)
            sum += Character.getNumericValue(ISBN.charAt(j)) * (10 - j);

        if (Character.isDigit(ISBN.charAt(9)))
            lastCharAsInt = Character.getNumericValue(ISBN.charAt(9));
        else
            lastCharAsInt = 10;

        if (11 - sum % 11 != lastCharAsInt)
            return "Invalid! ISBN fails the golden rule.";

        return "valid";
    }

}

