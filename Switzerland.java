
/**
 * Write a description of class Switzerland here.
 * 
 * @author Alexander Dong
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

public class Switzerland extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;

        g2.setBackground(new Color(255,0,0));
        
        Rectangle background = new Rectangle(0, 0, 900, 600);
        g2.setPaint(new Color(255, 0, 0));
        g2.fill(background);
        
        Rectangle centerSide = new Rectangle(250, 233, 400, 133);
        g2.setPaint(new Color(255, 255, 255));
        g2.fill(centerSide);
        
        Rectangle centerUp = new Rectangle(383, 100, 133, 400);
        g2.setPaint(new Color(255, 255, 255));
        g2.fill(centerUp);
    }
}

