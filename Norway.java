
/**
 * Write a description of class Iceland here.
 * 
 * @author Jonny Klingspon
 * @version 1
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;

//Swing is java's ui for frames, buttons, and other stuffs
import javax.swing.JComponent;

public class Norway extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        Rectangle bg = new Rectangle(0, 0, 900, 600);
        g2.setPaint(new Color(237, 41, 57));
        g2.fill(bg);

        Rectangle whiteVert = new Rectangle(252, 0, 144, 600);
        g2.setPaint(new Color(255, 255, 255));
        g2.fill(whiteVert);
    
        Rectangle whiteHoriz = new Rectangle(0, 233, 900, 133);
        g2.fill(whiteHoriz);

        Rectangle blueVert = new Rectangle(288, 0, 72, 600);
        g2.setPaint(new Color(0, 38, 100));
        g2.fill(blueVert);

        Rectangle blueHoriz = new Rectangle(0, 267, 900, 67);
        g2.fill(blueHoriz);
    }
}
