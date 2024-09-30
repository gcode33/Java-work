package Lab5;
import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Exercise2 {
    public static void main(String[]args){

        String input;
        input = JOptionPane.showInputDialog("\n\nPlease enter one character ");
        int wrd_cnt = input.length();
        char char_input = input.charAt(wrd_cnt-1);

        if(!Character.isDigit(char_input)){
            JOptionPane.showMessageDialog(null,"you did not enter a digit");
        }
        else{
            JOptionPane.showMessageDialog(null,"you entered a digit");

        }
    }
}
