import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
/**
 * Write a description of class GameComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameComponent extends JComponent
{
    public static final int BIRD_HEIGHT = 0;
    public static final int BIRD_WIDTH = 0;
    public static final int PIPE_GAP = 0;
    public static final int PIPE_SPACE = 0;
    public static final int PIPE_WIDTH = 0;


    public void paintComponent(String args[], Graphics g )
    {
        System.out.println("wut?");
        //MouseMotionEventDemo mouse = new MouseMotionEventDemo(this);
        Graphics2D g2 = (Graphics2D) g;

        Bird flappyBird = new Bird("images/Bird.jpg");

        flappyBird.draw(100, 100, g2);
        System.out.println("yolo");
        //System.out.println( mouse.getLastState() );


    }
}
