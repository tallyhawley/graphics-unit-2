package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ShapePanel extends JPanel{
    public ShapePanel(){
        setBackground(Color.WHITE);
        setVisible(true);
    }

    /*
     *All of your test code should be placed in paint.
     */
    public void paint(Graphics window){
	window.setColor(Color.WHITE);
	window.fillRect(0,0,getWidth(), getHeight());
	window.setColor(Color.BLUE);
        window.drawRect(20,20,getWidth()-40,getHeight()-40);
	window.setFont(new Font("TAHOMA",Font.BOLD,18));
	window.drawString("CREATE YOUR OWN SHAPE!",40,40);


	//instantiate a Shape
	//tell your shape to draw
        Shape s1 = new Shape(200,200,100,100,Color.BLUE, 5, 5);
        s1.draw(window);
	//instantiate a Shape
	//tell your shape to draw
        Shape s2 = new Shape(300,350,50,50, Color.DARK_GRAY, 5, 5);
        s2.draw(window);
	//instantiate a Shape
	//tell your shape to draw
        Shape s3 = new Shape(490, 100,80,90,Color.PINK, 5, 5);
        s3.draw(window);
        
        Shape s4 = new Shape(100,75,25,30, Color.cyan, 5, 5);
        s4.draw(window);
    }
}