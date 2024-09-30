package Lab7;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Exercise4 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        int perc = 0;
        int guess;
        int ans;
        int num;

        populatearr(arr);
        displaygrid(arr);
        sort(arr);
        displaygrid(arr);
        guess = Integer.parseInt(JOptionPane.showInputDialog("enter the number to search for"));
        ans = search(arr, guess);
        perc = over100(arr);
        JOptionPane.showMessageDialog(null, "the percentage of numbers above 100 is" + perc);
        JOptionPane.showMessageDialog(null, guess + "is in the array at" + Integer.toString(ans));
        num =  Integer.parseInt(JOptionPane.showInputDialog("enter the number to search for"));
        ans = numberCount(arr,num);
        JOptionPane.showMessageDialog(null, num + "appears this many times : " + Integer.toString(ans));

        System.exit(0);

    }

    public static void populatearr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000) + 1;
        }
    }

    public static void displaygrid(int[] arr) {
        String text = "";
        for (int i = 0; i < arr.length; i++) {
            text += String.format("%-8s", arr[i]);

            if ((i + 1) % 10 == 0) {
                text += "\n\n";
            }

        }
        JTextArea textArea = new JTextArea();
        Font textAreaFont = new Font("Courier New", Font.BOLD, 20);
        textArea.setFont(textAreaFont);
        textArea.append(text);
        JOptionPane.showMessageDialog(null, textArea, "sudoku game", JOptionPane.INFORMATION_MESSAGE);
        //System.out.print(text);
    }

    private static void sort(int[] arr) {
        int smallest;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }
    }

    public static int over100(int[] arr) {
        int perc = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                cnt++;
                //System.out.println(cnt);

            }

        }
        perc = (cnt * 100) / arr.length;
        return cnt;
    }

    public static int search(int[] arr, int guess) {
        int lowersub = 0, highersub = arr.length - 1, middlesub, ans = -1;
        while (lowersub <= highersub) {
            middlesub = (lowersub + highersub) / 2;
            if (arr[middlesub] < guess) {
                lowersub = middlesub + 1;
            } else if (arr[middlesub] > guess) {
                highersub = middlesub - 1;
            } else if (arr[middlesub] == guess) {
                ans = middlesub; // Set the index where the guess was found.
                break; // Exit the loop when a match is found.
            }
        }
        return ans;

    }
    public static int numberCount(int[] arr, int num){
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                cnt++;
            }
        }
        return cnt;
    }
}
