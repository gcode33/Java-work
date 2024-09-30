package ProblemSolving10.exercisea.driver;

//TestCircle.java
/*This driver program tests out the class Circle fully, along with the Cylinder and Point classes*/

import ProblemSolving10.exercisea.*;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle(4,3,6.6);

        Cylinder cylinder1 = new Cylinder(7,6,4.5,6.9);

        System.out.println("\n\nDisplaying the state of the Circle and Cylinder objects at this point\n\n" +
                "Circle Details:\n\n" + circle1 + "\n\nCylinder Details:\n\n" + cylinder1);

        //System.out.println("\n\nNow attempting to create a Point object\n\n");

        //Point point1 = new Point(-3,9); //A syntax error here when trying to create a Point object, because it only has package-access and the driver is
        //in a different package

        Circle[] circles = {circle1,cylinder1};

        /*Displaying the state of the array contents via polymorphism/dynamic method binding
        Note also the use of the method getClass(), which is used to determine the class name
        of the object under consideration. The call to getSimpleName() on this returns the "simple"
        name of the class, omitting the package details*/

        System.out.println("\n\nDisplaying the state of the Circle and Cylinder objects polymorphically (by using a Circle reference)\n\n");

        for(int i=0;i<circles.length;i++)
            System.out.println(circles[i].getClass().getSimpleName() + " details: \n\n" + circles[i] + "\n\n");

    }
}
