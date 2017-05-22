
/**
 * Write a description of class Ireland here.
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

public class Ireland extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle left = new Rectangle(0, 0, 300, 600);
        g2.setPaint(new Color(22, 155, 98));
        g2.fill(left);
        
        Rectangle right = new Rectangle(600, 0, 300, 600);
        g2.setPaint(new Color(255, 136, 62));
        g2.fill(right);
    }
}
