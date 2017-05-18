
/**
 * Write a description of class FaceViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
public class Game
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(600 , 400);
        frame.setTitle("Stage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Stage component = new Stage();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
