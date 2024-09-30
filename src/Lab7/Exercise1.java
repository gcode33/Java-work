package Lab7;

import javax.swing.*;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[]args){
        int[] first5 = new int[5];
        int[] luckyStars = new int[2];
        boolean alreadyPickedFirst5[] = new boolean[51];
        boolean alreadyPickedLuckyStars[] = new boolean[13];
        int random;
        //int randomNumber;
        int first = 0, second = 0, third = 0, fourth = 0, lucky1 = 0;

        for(int i = 1; i < 7; i++){

            random = (int) (Math.random() * 50) + 1;

            if(i < 5){
                first5[i] = random;

            }
            else{
                luckyStars[i-5] = random;
            }



        }
        Arrays.sort(first5);
        Arrays.sort(luckyStars);


        JOptionPane.showMessageDialog(null, "Winning nuumbers are: " +
                        Arrays.toString(first5)+"  Lucky Stars: " + Arrays.toString(luckyStars), "Euromillions Result",
                JOptionPane.INFORMATION_MESSAGE);



        System.exit(0);
    }
    }

