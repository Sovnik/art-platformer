
/**
 * Write a description of class Belgium here.
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

public class Belgium extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle left = new Rectangle(0, 0, 300, 600);
        g2.setPaint(new Color(0, 0, 0));
        g2.fill(left);
        
        Rectangle middle = new Rectangle(300, 0, 300, 600);
        g2.setPaint(new Color(255, 233, 54));
        g2.fill(middle);
        
        Rectangle right = new Rectangle(600, 0, 300, 600);
        g2.setPaint(new Color(255, 15, 33));
        g2.fill(right);
    }
}