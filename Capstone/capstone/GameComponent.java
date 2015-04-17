import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class GameComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameComponent extends JComponent

{
    public void paintComponent(String args[], Graphics g )
       // throws InterruptedException
    
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Bird flappyBird = new Bird("images/Black_Square_Bird.jpg");
        
        flappyBird.draw(getHeight()/2, getWidth()/2, g2);
        
        /*Thread.sleep(2000);
        
        flappyBird.draw(getHeight()/2 +500, getWidth()/2 +500, g2);
        */
    }
}
