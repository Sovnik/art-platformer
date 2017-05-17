import lwjgl.*;

public class DisplayExample{
    public void start(){
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();


        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(0);
        }

        while (!Display.isCloseRequested()) {
	        Display.update();
	    }

        Display.destroy();
    }

    public static void main(String[] argv) {
        DisplayExample displayExample = new DisplayExample();
	    displayExample.start();
    }
}
