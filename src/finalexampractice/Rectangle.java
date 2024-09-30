package finalexampractice;

import java.awt.*;

public class Rectangle extends AbstractShape implements Drawable {

    private Color colour;

    private boolean filled;


    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY, Color colour, boolean filled) {
        super(topLeftX, topLeftY, bottomRightX, bottomRightY);
        setColour(colour);
        setFilled(filled);
    }

    @Override
    public String getType() {
        return "rectangle";
    }

    @Override
    public void setColour(Color colour) {

    }

    @Override
    public void setFilled(boolean filled) {

    }

    @Override
    public Color getColour() {
        return colour;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public void draw(Graphics graphics) {

    }

    @Override
    public String toString() {
        return super.toString() +"Rectangle{" +
                "color=" + getColour()
                + "filled"+ isFilled()+
                '}';
    }
}
