import javax.swing.JFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Class that contains the main method for the program and 
 * creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameFrame extends JFrame
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    int score = 0;
    int delay = 15;
    GameComponent component; 
    class FrameWindowListener extends WindowAdapter
    {
        public void windowOpened(WindowEvent event)
        {
            component.requestFocusInWindow();
        }
    }
    public GameFrame()
    throws InterruptedException
    {
        // create and configure the frame (window) for the program
        component = new GameComponent();
        component.requestFocusInWindow();
        this.addWindowListener(new FrameWindowListener());
        //JFrame frame = new JFrame();

        /*frame.*/setSize(1000 /* x */, 700 /* y */);
        /*frame.*/setTitle("flex to begin");
        /*frame.*/setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // a frame contains a single component; create the Cityscape component
        //and add it to the frame
        //GameComponent component = new GameComponent();
        /*frame.*/add(this.component);
        /*frame.*/setVisible(true);
        Score score = new Score();

        // make the frame visible which will result in the paintComponent 
        //method being invoked on the
        //  component.
        int x = 0;
        Thread.sleep(1000);
        while(component.gameOver() == false)
        {
            Thread.sleep(delay);
            component.iterate();
            /*frame.*/repaint();
            //System.out.println(x);
            x++;
            String string = "Score:\t";
            setTitle(string + component.getScore() );
        }
        
        

    }
    

}
