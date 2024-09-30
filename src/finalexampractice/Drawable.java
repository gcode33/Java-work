package finalexampractice;

import java.awt.*;

public interface Drawable {


    public abstract void setColour(Color colour);
    public abstract void setFilled(boolean filled);
    public abstract Color getColour();
    public abstract boolean isFilled();
    public abstract void draw(Graphics graphics);
}
