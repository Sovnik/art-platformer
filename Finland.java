
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

public class Finland extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        Rectangle bg = new Rectangle(0, 0, 900, 600);
        g2.setPaint(new Color(255, 255, 255));
        g2.fill(bg);

        Rectangle blueVert = new Rectangle(250, 0, 150, 600);
        g2.setPaint(new Color(0, 47, 108));
        g2.fill(blueVert);

        Rectangle blueHoriz = new Rectangle(0, 218, 900, 164);
        g2.fill(blueHoriz);
    }
}
