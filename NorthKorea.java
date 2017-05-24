
/**
 * Write a description of class FaceComponent here.
 * 
 * @author Jonny Klingspon
 * @version 04_24_2017
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JComponent;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
public class NorthKorea extends JComponent{
    public void paintComponent(Graphics g){
        //Recover Graphics2d
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle first = new Rectangle(0, 0, 900, 100);
        g2.setPaint(new Color(0, 0, 255));
        g2.fill(first);
        Rectangle second = new Rectangle(0, 100, 900, 17);
        g2.setPaint(new Color(255, 255, 255));
        g2.fill(second);
        Rectangle third = new Rectangle(0, 117, 900, 367);
        g2.setPaint(new Color(255, 0, 0));
        g2.fill(third);
        Rectangle fourth = new Rectangle(0, 484, 900, 17);
        g2.setPaint(new Color(255, 255, 255));
        g2.fill(fourth);
        Rectangle fifth = new Rectangle(0, 501, 900, 100);
        g2.setPaint(new Color(0, 0, 255));
        g2.fill(fifth);
        Ellipse2D.Double circle = new Ellipse2D.Double(200, 167, 267, 267);
        g2.setPaint(new Color(255, 255, 255));
        g2.fill(circle);
        try{
           BufferedImage star = ImageIO.read(new File("star_nk.png"));
            g2.drawImage(star, 200, 160, 265, 255, null);
        }catch (java.io.IOException io){
            System.out.println("Image not found.");
        }
    }
}
