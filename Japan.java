
/**
 * Write a description of class Japan here.
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

public class Japan extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double center = new Ellipse2D.Double(300, 150, 300, 300);
        g2.setPaint(new Color(255, 0, 0));
        g2.fill(center);
    }
}
