
/**
 * Write a description of class FaceComponent here.
 * 
 * @author Alexander Dong
 * @version 04_21_2017
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

public class Stage extends JComponent
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle ground = new Rectangle(0, 800, 100, 100);
        g2.setPaint(new Color(0, 255, 255));
        g2.fill(ground);
        
        for (int i = 0; i < 800; i++)
        {
            ground.setRect(0 + i, 0 - i, 100, 100);
            g2.fill(ground);
        }
        
        /*
        //Draw the head
        Ellipse2D.Double head = new Ellipse2D.Double(150 , 100 , 100 , 130);
        g2.draw(head);

        //Draw the eyes
        Rectangle eye = new Rectangle(175 , 135 , 10 , 20);
        g2.fill(eye);
        eye.translate(50, 0);
        g2.fill(eye);

        //Draw the mouth
        Line2D.Double mouth = new Line2D.Double();
        mouth.setLine(185 , 200 , 225 , 195);
        g2.draw(mouth);

        //Draw eyebrows
        QuadCurve2D.Double eyebrow1 = new QuadCurve2D.Double();
        eyebrow1.setCurve(175.0 , 120.0 , 180.0 , 110.0 , 185.0 , 120.0);
        g2.draw(eyebrow1);
        QuadCurve2D.Double eyebrow2 = new QuadCurve2D.Double();
        eyebrow1.setCurve(225.0 , 130.0 , 230.0 , 128.0 , 235.0 , 130.0);
        g2.draw(eyebrow1);
        */
    }
}
