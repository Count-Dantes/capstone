import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;;
/**
 * Write a description of class GameComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameComponent extends JComponent
{
    public static final int PIPE_GAP = 200;
    public static final int PIPE_WIDTH = 150;
    public Bird flappyBird = new Bird("images/andrewBirdSmall.png", 100, 200);
    public Pipe pipe1 = new Pipe(PIPE_WIDTH, PIPE_GAP, this.generateHeight(), 400);
    public Pipe pipe2 = new Pipe(PIPE_WIDTH, PIPE_GAP, this.generateHeight(), 900);
    public GameOverScreen gameOverScreen = new GameOverScreen(1000,700);
    public int score = 0;

    public void paintComponent(Graphics g )
    {
        //System.out.println("wut?");
        //MouseMotionEventDemo mouse = new MouseMotionEventDemo(this);
        Graphics2D g2 = (Graphics2D) g;

        Background background = new Background(1000, 700);

        background.draw(g2);

        flappyBird.draw(g2);

        pipe1.draw(g2);
        pipe2.draw(g2);
        if(this.gameOver() == true)
        {
            gameOverScreen.draw(g2);
        }

        this.setFocusable(true);
        this.addKeyListener(new KeyStrokeListener());
    }

    public void iterate()
    {
        flappyBird.iterate();
        if( pipe1.iterate() )
        {
            this.score ++;
        }
        if( pipe2.iterate() )
        {
            this.score ++;
        }

    }
    
    public int getScore()
    {
        return this.score;        
    }

    public boolean gameOver()
    {
        //System.out.println(this.flappyBird.getYPos());
        if ( (this.flappyBird.getYPos() <= 0) || (this.flappyBird.getYPos() >= 700))
        {
            return true;
        }
        if (this.checkCollision(this.flappyBird, this.pipe1) == true)
        {
            return true;
        }
        if (this.checkCollision(this.flappyBird, this.pipe2) == true)
        {
            return true;
        }

        return false;

    }

    public int generateHeight()
    {
        int height = (int) (Math.random() *500);
        //System.out.println("height\t/t");
        return height;

    }

    public boolean checkCollision(Bird bird, Pipe pipe)
    {
        //System.out.println(pipe1.intersection( bird.getXPos(), bird.getYPos()) );
        if ( pipe.intersection( bird.getXPos(), bird.getYPos() ) == true) 
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }

    class KeyStrokeListener implements KeyListener
    //borrowed from example on canvas, thanks nic
    {
        public void keyPressed(KeyEvent event) 
        {
            //System.out.print("keypressed");
            String key = KeyStroke.getKeyStrokeForEvent(event).toString().replace("pressed ", ""); 
            //System.out.println(key);
            if (key.equals("UP"))
            {
                //System.out.println("up");
                flappyBird.flap();           
            }
        }

        public void keyTyped(KeyEvent event) {}

        public void keyReleased(KeyEvent event) {}
    }
}
