package ProblemSolving10.exercisea;

//Cylinder.java
/*A instantiable class definition for a Cylinder, this class inherits from the Circle class*/

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        this(0,0,0,0);
    }

    public Cylinder(int x, int y, double radius,double height) {
        super(x,y,radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return perimeter()*height + super.area()*2;
    }

    public double volume() {
        return super.area()*height;
    }

    public String toString() {
        return "Centre: " + getCentre()  + "\nRadius: " + getRadius() + "\nHeight: " + getHeight() +
                "\nSurface Area: " + area() + "\nVolume: " + volume();
    }

}
