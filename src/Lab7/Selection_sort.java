package Lab7;

import javax.swing.*;
import java.util.Arrays;

public class Selection_sort {
    public static void main(String[]args){
        double [] weights  = new double[10];
        populateArray(weights);
        JOptionPane.showMessageDialog(null, "the unsorted array"+ Arrays.toString(weights));
        selectionSort(weights);
        JOptionPane.showMessageDialog(null, "the sorted array"+ Arrays.toString(weights));
    }



    private static void populateArray(double[] weights) {
        for(int i =0; i < weights.length; i++){
           weights[i] =  Double.parseDouble(JOptionPane.showInputDialog("enter the weight for the people"+ (i +1)));
        }
    }
    private static void selectionSort(double[] weights) {
        int smallest;
        double temp;

        for(int i = 0; i < weights.length-1; i++){
            smallest = i;
            for(int j = i +1; j< weights.length;j++){
                if(weights[j] < weights[smallest]){
                    smallest = j;
                }
                temp = weights[i];
                weights[i] = weights[smallest];
                weights[smallest] = temp;
            }
        }
    }
}
