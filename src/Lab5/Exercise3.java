package Lab5;
import javax.swing.*;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[]args){
        int c_cnt = 0;
        int p_cnt=0;
        int d_cnt = 0;
        int g_cnt = 0;

        String dialog;
        Scanner scanner = new Scanner(System.in);


        dialog = JOptionPane.showInputDialog("\n\ndo you want to play the game ");

        while(!dialog.equals("no")) {
            g_cnt++;
            rollTheDice();
            char winner = rollTheDice();
            if(winner == 'c'){
                c_cnt++;
                JOptionPane.showMessageDialog(null,"the computer won");

            }
            else if (winner == 'p') {
                p_cnt++;
                JOptionPane.showMessageDialog(null,"the player won");


            }
            else{
                d_cnt++;
                JOptionPane.showMessageDialog(null,"it was a draw");

            }

            dialog = JOptionPane.showInputDialog("\n\ndo you want to play again? ");

            //update win counters
        }
        JOptionPane.showMessageDialog(null,"the number of games: "+g_cnt+"\nthe player won: " +p_cnt+"\nthe computer won: " +c_cnt+"\ndraws: " +d_cnt,  " games",JOptionPane.INFORMATION_MESSAGE);

    }
    public static char rollTheDice() {
        int humanRoll = (int)(Math.random() * 11) + 2;
        int computerRoll = (int)(Math.random() * 11) + 2;
        char win;

        if(humanRoll < computerRoll){
            win = 'c';
        }
        else if (computerRoll < humanRoll)
        {
            win = 'p';
        }
        else{
            win = 'd';
        }

        return win;

    }
}
