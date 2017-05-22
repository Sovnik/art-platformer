
/**
 * Write a description of class France here.
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

public class France extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle left = new Rectangle(0, 0, 300, 600);
        g2.setPaint(new Color(0, 85, 164));
        g2.fill(left);
        
        Rectangle right = new Rectangle(600, 0, 300, 600);
        g2.setPaint(new Color(239, 65, 53));
        g2.fill(right);
    }
}
