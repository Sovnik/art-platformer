
/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
public class Stage1
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(916 , 636);
        frame.setTitle("Stage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        China component = new China();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
