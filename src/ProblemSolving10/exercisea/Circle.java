package ProblemSolving10.exercisea;

//Circle.java
/*A instantiable class definition for a Circle*/

public class Circle {

    private Point centre;
    private double radius;

    public Circle() {
        this(0,0,0);
    }

    public Circle(int x, int y, double radius) {
        setCentre(x,y);
        setRadius(radius);
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(int x, int y) {
        centre = new Point(x,y);
    }

    public void setCentre(Point p) {
        centre = p;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI*radius*radius;
    }

    public double perimeter() {
        return 2*Math.PI*radius;
    }

    public String toString() {
        return "Centre: " + getCentre()  + "\nRadius: " + getRadius() + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }

}