package finalexampractice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class testShape {
    public static void main(String[] args) {
        // Create an ArrayList to store shapes
        ArrayList<AbstractShape> allshapes = new ArrayList<>();

        // Create Rectangle objects and add them to the list
        Rectangle rectangle1 = new Rectangle(5, 19, 17, 8, Color.RED, false);
        Rectangle rectangle2 = new Rectangle(21, 22, 5, -5, Color.ORANGE, true);
        Rectangle rectangle3 = new Rectangle(45, 20, 64, 10, Color.GREEN, false);

        allshapes.add(rectangle1);
        allshapes.add(rectangle2);
        allshapes.add(rectangle3);

        // Create Oval object and add it to the list
        Oval oval = new Oval(27, 12, 43, -2, Color.BLACK, true);
        allshapes.add(oval);

        // Iterate over the list of shapes
        int i = 1;
        for (AbstractShape shape : allshapes) {
            System.out.println("Shape " + i + ": " + shape);
            i++;
        }

        Iterator<AbstractShape>iterator = allshapes.iterator();
        while (iterator.hasNext()){
            AbstractShape shape = iterator.next();
            if(shape.getWidth() > 17){
                iterator.remove();
            }

        }
        int j = 1;
        for (AbstractShape shape : allshapes) {
            System.out.println("Shape " + j + ": " + shape);
            j++;
        }
    }
}
