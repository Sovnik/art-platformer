// Author: Jonathan Klingspon

 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import java.awt.geom.Ellipse2D;
 import java.awt.geom.Line2D;
 import java.awt.geom.QuadCurve2D;
 import javax.swing.JComponent;

public class Russia extends JComponent{

    public void paintComponent(Graphics g){
    
        Graphics2D g2 = (Graphics2D) g;

        Rectangle mid = new Rectangle(0, 200, 900, 200);
        g2.setPaint(new Color(0, 0, 255));
        g2.fill(mid);
        Rectangle bot = new Rectangle(0, 400, 900, 200);
        g2.setPaint(new Color(255, 0, 0));
        g2.fill(bot);
    }
}
