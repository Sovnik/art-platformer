
/**
 * Write a description of class Thailand here.
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

public class Thailand extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle top = new Rectangle(0, 0, 900, 100);
        g2.setPaint(new Color(255, 0, 0));
        g2.fill(top);
        
        Rectangle center = new Rectangle(0, 200, 900, 200);
        g2.setPaint(new Color(36, 29, 80));
        g2.fill(center);
        
        Rectangle bottom = new Rectangle(0, 500, 900, 100);
        g2.setPaint(new Color(255, 0, 0));
        g2.fill(bottom);
    }
}
