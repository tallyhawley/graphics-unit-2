package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MovingShapePanel extends JPanel implements Runnable{
	
	private Shape shape;
	
	public MovingShapePanel() {
		setBackground(Color.WHITE);
		setVisible(true);
		
		shape = new Shape(200, 200, 50, 50, Color.PINK);
		
		new Thread(this).start();
		
	}
	
	public void update(Graphics window) {
		paint(window);
	}
	
	public void paint(Graphics window){
		
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		shape.setX(shape.getX()+shape.getXSpeed());
		shape.setY(shape.getY()+shape.getYSpeed());
    	shape.draw(window);
    	
    	if(shape.getX() <= 20 || shape.getX() >= getWidth()-70) {
    		shape.setXSpeed(-shape.getXSpeed());
    	}
    	if(shape.getY() <= 20 || shape.getY() >= getHeight()-70) {
    		shape.setYSpeed(-shape.getYSpeed());
    	}
	}

	@Override
	public void run() {
		try
		{
			while(true) {
				Thread.currentThread().sleep(10);
				repaint();
			}
		}catch(Exception e) {}
		
	}
}
