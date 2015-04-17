import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird
{
    /** description of instance variable x (add comment for each instance variable) */
    ImageIcon birdIcon;

    /**
     * Default constructor for objects of class Bird
     * @pre            expects the given valid adress to lead to a square image
     */
    public Bird(String birdImageAddress)
    {
        birdIcon = new ImageIcon("birdImageAddress");
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
    public void draw(int xPos, int yPos,int height, int width, Graphics2D g2)
    {
        //this.paintIcon(GameComponent ,g2, xPos, yPos);
        /*public void paintIcon(Component c,
             Graphics g,
             int x,
             int y)
             */
        g2.drawImage( birdIcon.getImage().getScaledInstance(width, height, 0));
            
        
    }

}
