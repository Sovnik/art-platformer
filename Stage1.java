
/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Window;
import java.awt.Component;
import java.util.Scanner;
public class Stage1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type a flag to print it, to exit type anything not a string");
        JFrame frame = new JFrame();
        frame.setSize(916 , 636);
        frame.setTitle("Stage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(in.hasNextLine()) {
            String flag = in.nextLine();

            if (flag.equalsIgnoreCase("France")) {
                France component = new France();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("Japan")) {
                Japan component = new Japan();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("Ukraine")) {
                Ukraine component = new Ukraine();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("Austria")) {
                Austria component = new Austria();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("Thailand")) {
                Thailand component = new Thailand();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("China")) {
                China component = new China();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("Hungary")) {
                Hungary component = new Hungary();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("Bangladesh")) {
                Bangladesh component = new Bangladesh();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("Belgium")) {
                Belgium component = new Belgium();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("Greenland")) {
                Greenland component = new Greenland();
                frame.add(component);
            }
            if (flag.equalsIgnoreCase("NorthKorea")) {
                NorthKorea component = new NorthKorea();
                frame.add(component);
            }
            if(flag.equalsIgnoreCase("clear")) {
                frame.getContentPane().removeAll();
                frame.revalidate();
                frame.repaint();
            }
            if (flag.equalsIgnoreCase("close")) {
                break;
            }
            frame.setVisible(true);
            
            System.out.println("Type a flag to print it, to exit type anything not a string");
        }
    }
}



































