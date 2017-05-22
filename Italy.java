
/**
 * Write a description of class Italy here.
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

public class Italy extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle left = new Rectangle(0, 0, 300, 600);
        g2.setPaint(new Color(0, 146, 71));
        g2.fill(left);
        
        Rectangle right = new Rectangle(600, 0, 300, 600);
        g2.setPaint(new Color(207, 43, 54));
        g2.fill(right);
    }
}