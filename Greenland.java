
/**
 * Write a description of class Greenland here.
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

public class Greenland extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle top = new Rectangle(0, 0, 900, 300);
        g2.setPaint(new Color(255, 255, 255));
        g2.fill(top);
        
        Rectangle bottom = new Rectangle(0, 300, 900, 300);
        g2.setPaint(new Color(255, 0, 0));
        g2.fill(bottom);
        
        Ellipse2D.Double center = new Ellipse2D.Double(300, 150, 300, 300);
        g2.setPaint(new Color(255, 255, 255));
        g2.fill(center);
        
        QuadCurve2D.Double topSemi = new QuadCurve2D.Double();
        topSemi.setCurve(300 , 300 , 230.0 , 128.0 , 300 , 600);
        g2.draw(topSemi);
    }
}