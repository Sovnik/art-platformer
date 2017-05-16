
/**
 * Write a description of class FaceViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
public class FaceViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(450 , 450);
        frame.setTitle("Questioning Authority");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        FaceComponent component = new FaceComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
