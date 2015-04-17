import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameVeiwer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String args[])
           throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(1000 /* x */, 600 /* y */);
        frame.setTitle("Andrew's zone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        GameComponent component = new GameComponent();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
    }

}
