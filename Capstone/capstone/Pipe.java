import javax.swing.ImageIcon;
import java.awt.Color;
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
    int width;
    int PIPE_GAP;
    Rectangle2D topRectangle;
    Rectangle2D botRectangle;

    /**`
     * Default constructor for objects of class Pipe
     * @pre            expects the given valid adress to lead to a square image
     */
    public Pipe(int PIPE_WIDTH, int PIPE_GAP, int initialHeight, int xPos)
    {
        this.xLeft = xPos;
        this.xRight = xPos + PIPE_WIDTH;
        this.yTop = initialHeight;
        this.yBot = initialHeight + PIPE_GAP;
        this.width = PIPE_WIDTH;
        this.PIPE_GAP = PIPE_GAP;
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
        topRectangle = new Rectangle2D.Double(this.xLeft, 0, this.width, yTop);
        botRectangle = new Rectangle2D.Double(this.xLeft, this.yBot, this.width, 700);
        g2.setPaint(Color.GREEN);
        g2.fill(topRectangle);
        g2.fill(botRectangle);
    }
    
    public boolean intersection(int xBird, int yBird)
    {
        if(this.topRectangle.contains(xBird, yBird) )
        {
            return true;
        }
        
        if(this.botRectangle.contains(xBird, yBird) )
        {
            return true;
        }
        
        return false;
    }
    
    public boolean iterate()
    {
        if( this.xLeft > 0)
        {
            xLeft-=5;
            return false;
        }
        else
        {
            xLeft = 1000;
            this.yTop = (int) (Math.random() *500);
            this.yBot = this.yTop + this.PIPE_GAP;
            return true;
        }
        
    }

}