package graphics;

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame{
	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;
	
	
	public GraphicsRunner(){
        setSize(WIDTH,HEIGHT);
        getContentPane().add(new MovingShapePanel());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public static void main(String[] args) {
		GraphicsRunner run = new GraphicsRunner();
	}

}
