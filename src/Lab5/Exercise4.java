package Lab5;

import javax.swing.*;

public class Exercise4 {
    public static void main(String[]args){
        double x_cor1,x_cor2,y_cor1,y_cor2;
        double rad = 0.0;

        x_cor1 = Double.parseDouble(JOptionPane.showInputDialog("\n\nplease enter the x co-ordinate of the circles centre "));
        y_cor1 = Double.parseDouble(JOptionPane.showInputDialog("\n\nplease enter the y co-ordinate of the circles centre "));
        rad = Double.parseDouble(JOptionPane.showInputDialog("\n\nplease enter the radius of the circle "));
        x_cor2 = Double.parseDouble(JOptionPane.showInputDialog("\n\nplease enter the x co-ordinate of the second point "));
        y_cor2 = Double.parseDouble(JOptionPane.showInputDialog("\n\nplease enter the y co-ordinate of the second point "));
        String f_result = pointLocater(rad,x_cor1,x_cor2,y_cor1,y_cor2);
        JOptionPane.showMessageDialog(null,"the second point is "+f_result, "Point Locator", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }


    private static String pointLocater(double radius,double x1, double x2, double y1, double y2) {

        double distance = Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));
        String result;
        if(radius < distance){
            result = "outside the circle";
        }
        else if (radius > distance)
        {
            result = "inside the circle";

        }
        else{
            result = "on the circle";
        }
        return result;
    }
}
