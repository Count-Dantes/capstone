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
    int xPos;
    int yPos;
    int flapVar = 0;

    /**
     * Default constructor for objects of class Bird
     * @pre            expects the given valid adress to lead to a square image
     */
    public Bird(String birdImageAddress,int x, int y )
    {
        this.xPos = x;
        this.yPos = y;
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
    public void draw(Graphics2D g2)
    {
        //g2.drawImage( birdIcon.getImage(), this.xPos, this.yPos, null);
        g2.drawImage( birdIcon.getImage(), this.xPos, this.yPos, null);

        //.getScaledInstance(width, height, 0)
    }

    public int getXPos()
    {
        return this.xPos;
    }

    public int getYPos()
    {
        return this.yPos;
    }

    public void iterate()
    {
        if(this.isFlap() == true)
        {
            this.yPos-=15;

        }
        else
        {
            this.yPos+=5;

        }
        
    }
    
    public boolean isFlap()
    {
        if(this.flapVar>0)
        {
            //System.out.println("flapvar true");
            this.flapVar --;
            return true;
        }
        return false;
        
    }
    
    public void flap()
    {
        this.flapVar = 5;
        
    }

}


