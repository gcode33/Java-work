package Lab6;

import javax.swing.*;

public class Exercise4 {
    public static void main(String[]args){
        double[] value={22.3, 45.6,27.4,56.6,73.2,11.5,87.4,23.8};
        double ans = largest(value);
        JOptionPane.showMessageDialog(null,"The largest number is : " + ans, "largest",JOptionPane.INFORMATION_MESSAGE);

        double ans2 = average(value);


        JOptionPane.showMessageDialog(null,"The average number is : " + String.format("%.2f",ans2), "largest",JOptionPane.INFORMATION_MESSAGE);

        String listAboveAverage = above_avg(ans2,value);
        JOptionPane.showMessageDialog(null,"The numbers above the average are: " + listAboveAverage, "largest",JOptionPane.INFORMATION_MESSAGE);






        System.exit(0);



    }
    public static double largest(double[] value){
        double large = value[0];
        for(int cnt = 0; cnt < value.length; cnt++){

            if(large< value[cnt]){
                large = value[cnt];
            }
        }
        return large;
    }

    public static double average(double [] value){
        double avg = value[0];
        double avg_ans = 0;
        int cnt = 1;
        for(int i = 1; i < value.length; i++){
            avg += value[i];
            cnt++;
        }
        avg_ans = avg/cnt;



        return avg_ans;
    }
    public static String above_avg(double average, double [] value ){
        double abv_avg;
        String list = "";

        for(int i = 1; i < value.length; i++){
            if(value[i] > average)
                list += value[i]+",";
        }
        return list;
    }
}
