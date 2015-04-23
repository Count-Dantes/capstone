import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;

    /**
     * Default constructor for objects of class Background
     */
    public Background(int xBound, int yBound)
    {
        this.x = xBound;
        this.y = yBound;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        for (float i=0; i < this.x; i++)
        {
            GradientPaint gradient = new GradientPaint(i,0,Color.BLUE,i,this.y,Color.RED,true);
            g2.setPaint(gradient);
            Rectangle backgroundSegment = new Rectangle((int)i,0,1,this.y);
            g2.fill(backgroundSegment);
        }
    }

}
