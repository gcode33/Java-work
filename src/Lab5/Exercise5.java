package Lab5;

import javax.swing.*;

public class Exercise5 {
    public static void main(String[] args) {

        String first5 = "", luckyStars = "";
        int randomNumber;
        int first = 0, second = 0, third = 0, fourth = 0, lucky1 = 0;

        for(int i = 1; i <= 7; i++){

            if(i <= 5) {
                randomNumber = (int) (Math.random() * 50) + 1;

                while(randomNumber == first || randomNumber == second || randomNumber == third
                        || randomNumber == fourth)

                    randomNumber = (int) (Math.random() * 50) + 1;


                switch(i){

                    case 1:
                        first = randomNumber;
                        break;

                    case 2:
                        second = randomNumber;
                        break;

                    case 3:
                        third = randomNumber;
                        break;

                    case 4:
                        fourth = randomNumber;
                        break;

                }

                first5 += randomNumber + "  ";
            }
            else {
                randomNumber = (int) (Math.random() * 12) + 1;

                while(randomNumber == lucky1)
                    randomNumber = (int) (Math.random() * 12) + 1;

                switch(i) {
                    case 6:
                        lucky1 = randomNumber;
                }

                luckyStars += randomNumber + "  ";
            }
        }

        JOptionPane.showMessageDialog(null,"Winning nuumbers are:\n\n" +
                        first5 + "  Lucky Stars: " + luckyStars,"Euromillions Result",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
