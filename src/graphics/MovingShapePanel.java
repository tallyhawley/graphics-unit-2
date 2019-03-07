package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MovingShapePanel extends JPanel implements Runnable{
	
	private Shape shape1;
	private Shape shape2;
	private Shape shape3;
	private Shape shape4;
	
	public MovingShapePanel() {
		setBackground(Color.WHITE);
		setVisible(true);
		
		shape1 = new Shape(200, 200, 50, 50, Color.PINK, 5, 4);
		shape2 = new Shape(100,79, 50, 50, Color.CYAN, 5,7);
		shape3 = new Shape(300,267,50,50, Color.MAGENTA, 7,6);
		shape4 = new Shape(500,300,60,60, Color.BLUE, 4,5);
		
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

		move(window, shape1);
    	
    	move(window, shape2);
    	
    	move(window, shape3);
    	
    	move(window, shape4);
	}
	
	public void move(Graphics window, Shape shape1) {
    	shape1.setX(shape1.getX()+shape1.getXSpeed());
		shape1.setY(shape1.getY()+shape1.getYSpeed());
    	shape1.draw(window);
    	
    	if(shape1.getX() <= 20 || shape1.getX() >= getWidth()-70) {
    		shape1.setXSpeed(-shape1.getXSpeed());
    	}
    	if(shape1.getY() <= 20 || shape1.getY() >= getHeight()-70) {
    		shape1.setYSpeed(-shape1.getYSpeed());
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
