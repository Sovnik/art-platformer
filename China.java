
/**
 * Write a description of class China here.
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

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

//Swing is java's ui for frames, buttons, and other stuffs
import javax.swing.JComponent;

public class China extends JComponent 
{
    public void paintComponent(Graphics g)
    {
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;

        Rectangle background = new Rectangle(0, 0, 900, 600);
        g2.setPaint(new Color(255, 0, 0));
        g2.fill(background);

        try {
            BufferedImage img = ImageIO.read(new File("StarsOfChina.png"));
            g2.drawImage(img, 65, 50, 260, 200, null);
        }
        catch (java.io.IOException io) {

        }
    }
}
