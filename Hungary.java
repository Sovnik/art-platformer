
/**
 * Write a description of class Hungary here.
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

public class Hungary extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle top = new Rectangle(0, 0, 900, 200);
        g2.setPaint(new Color(205, 42, 61));
        g2.fill(top);
        
        Rectangle bottom = new Rectangle(0, 400, 900, 200);
        g2.setPaint(new Color(67, 111, 76));
        g2.fill(bottom);
    }
}
