import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe
{
    /** description of instance variable x (add comment for each instance variable) */
    int xLeft;
    int xRight;
    int yTop;
    int yBot;

    /**
     * Default constructor for objects of class Bird
     * @pre            expects the given valid adress to lead to a square image
     */
    public Pipe(int PIPE_WIDTH, int height, int xPos)
    {
        birdIcon = new ImageIcon(birdImageAddress);

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
    public void draw(int x, int y, Graphics2D g2)
    {
        this.xPos = x;
        this.yPos = y;
        g2.drawImage( birdIcon.getImage(), xPos, yPos, null);
        //.getScaledInstance(width, height, 0)
    }
    
    public int returnXPos()
    {
        return this.xPos;
    }
    
    public int returnYPos()
    {
        return this.yPos;
    }

}