package Lab7;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String[] names = new String[3];
        double[] gpa = new double[3];


        fillnamearray(names);
        fillgpaarray(gpa);
        JOptionPane.showMessageDialog(null, "the unsorted array" + Arrays.toString(names) + Arrays.toString(gpa));

        sortarrays(names, gpa);
        JOptionPane.showMessageDialog(null, "the sorted array" + Arrays.toString(names) + Arrays.toString(gpa));
        displaygrid(names, gpa);

    }

    private static void fillgpaarray(double[] gpa) {
        for (int i = 0; i < gpa.length; i++) {
            gpa[i] = Double.parseDouble(JOptionPane.showInputDialog("enter the gpa for the people" + (i + 1)));
        }
    }

    private static void fillnamearray(String[] names) {
        for (int i = 0; i < names.length; i++) {
            names[i] = JOptionPane.showInputDialog("enter the name for the people" + (i + 1));
        }
    }

    private static void sortarrays(String[] names, double[] grades) {
        int smallest;
        double temp;
        String tempname;

        for (int i = 0; i < grades.length - 1; i++) {
            smallest = i;
            for (int j = i + 1; j < grades.length; j++) {
                if (grades[j] < grades[smallest]) {
                    smallest = j;
                }
                temp = grades[i];
                grades[i] = grades[smallest];
                grades[smallest] = temp;
                tempname = names[i];
                names[i] = names[smallest];
                names[smallest] = tempname;
            }
        }

    }

    private static void displaygrid(String[] names, double[] grades) {
        JTextArea textArea = new JTextArea();
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);

        textArea.setFont(textAreaFont);

        textArea.append(String.format("%-25s%s\n%-25s%s\n\n","Name","GPA","------","-----"));

        for(int i = names.length-1; i >= 0; i--)
            textArea.append(String.format("%-25s%.2f\n",names[i],grades[i]));

        JOptionPane.showMessageDialog(null,textArea,"Sorted Results",JOptionPane.INFORMATION_MESSAGE);
    }
}
