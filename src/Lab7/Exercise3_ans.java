//Exercise3.java
/*This program populates an array of t-numbers and a parallel array of course names with values. It then displays it, then sorts them into
 *ascending order by t-number, using the selection-sort algorithm, then re-displays it after sorting. Next it prompts the user for a
 *t-number and performs a binary-search algorithm on the t-numbers array to find the t-number, issuing an appropriate message depending
 *on whether it is found or not. Finally the program displays a number of statistics based on the contents of the arrays*/

package Lab7;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.Arrays;

public class Exercise3_ans {
    public static void main(String[] args) {

        String[] tNumbers = new String[10];
        String[] courseNames = new String[10];

        String tNumber;
        int searchSubscript;
        int countT003=0, countHLorChemistry=0,countComputingT00036Onwards=0;
        String text="";

        populateArrays(tNumbers,courseNames);
        JOptionPane.showMessageDialog(null,"Before sorting, the contents of the t-numbers and course names arrays are:\n\n" +
                Arrays.toString(tNumbers) + "\n" + Arrays.toString(courseNames));

        selectionSort(tNumbers,courseNames);

        JOptionPane.showMessageDialog(null,"After sorting, the contents of the t-numbers and course names arrays are:\n\n" +
                Arrays.toString(tNumbers) + "\n" + Arrays.toString(courseNames));

        tNumber = JOptionPane.showInputDialog("Enter the t-number of the student you seek");

        searchSubscript = binarySearch(tNumbers,tNumber);

        if(searchSubscript!=-1)
            JOptionPane.showMessageDialog(null,"The t-number you sought was found in the array and the corresponding course name " +
                    "for this student is " + courseNames[searchSubscript],"Found!",JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"The t-number you sought was not found in the array","Not Found!",JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < tNumbers.length; i++) {

            if(tNumbers[i].startsWith("t003"))
                countT003++;

            if(courseNames[i].equals("Health & Leisure") || courseNames[i].equals("Chemistry"))
                countHLorChemistry++;

            if(courseNames[i].equals("Computing") && tNumbers[i].compareTo("t00036") >= 0)
                countComputingT00036Onwards++;

            if(courseNames[i].equals("Mechtronics") || courseNames[i].equals("Early Childcare") || courseNames[i].equals("Computing"))
                text += String.format("%-20s%s\n",tNumbers[i],courseNames[i]);

        }

        JTextArea textArea = new JTextArea();
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textAreaFont);

        textArea.append("The number of students whose t-number begins with \"t003\" is " + countT003);
        textArea.append("\nThe number of students whose course name is either \"Health & Leisure\" or \"Chemistry\" is " + countHLorChemistry);
        textArea.append("\nThe percentage of students taking the \"Computing\" course whose t-number is from \"t00036\" onwards is " + (countComputingT00036Onwards*10) + "%");
        textArea.append("\n\nThe list of t-numbers/course names for students taking \"Mechtronics\",\"Early Childcare\" or \"Computing\"");
        textArea.append(String.format("\n\n%-20s%s\n%-20s%s\n\n","T-Number","Course Name","---------","---------"));
        textArea.append(text);

        JOptionPane.showMessageDialog(null,textArea,"Student Statistics",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }


    public static void populateArrays(String[] tNumbers, String[] courseNames) {

        for (int i = 0; i < tNumbers.length; i++) {

            tNumbers[i] = JOptionPane.showInputDialog("Enter t-number for student " + (i+1));
            courseNames[i] = JOptionPane.showInputDialog("Enter course name for student " + (i+1));
        }
    }


    public static void selectionSort(String[] tNumbers,String[] courseNames) {

        String temp;
        int subSmallest;

        for (int i = 0; i < tNumbers.length-1; i++) {

            subSmallest = i;

            for (int j = i+1; j < tNumbers.length; j++)
                if (tNumbers[j].compareTo(tNumbers[subSmallest]) < 0)
                    subSmallest = j;


            temp = tNumbers[i];
            tNumbers[i] = tNumbers[subSmallest];
            tNumbers[subSmallest] = temp;

            temp = courseNames[i];
            courseNames[i] = courseNames[subSmallest];
            courseNames[subSmallest] = temp;
        }
    }

    public static int binarySearch(String[] tNumbers, String tNumber) {

        int lowerSub = 0, higherSub = tNumbers.length-1, middleSub;

        while(lowerSub<=higherSub) {

            middleSub = (lowerSub+higherSub)/2;

            if(tNumbers[middleSub].compareTo(tNumber) < 0)
                lowerSub = middleSub+1;
            else if(tNumbers[middleSub].compareTo(tNumber) > 0)
                higherSub = middleSub-1;
            else
                return middleSub;
        }

        return -1;
    }
}
