package graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Shape {
    private int x;
    private int y;
    private int w;
    private int h;
    private Color c;
    private int xSpeed;
    private int ySpeed;
    
    public Shape(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
        this.c = color;
        this.xSpeed = 5;
        this.ySpeed = 5;
    }
    
    public void draw(Graphics window){
        window.setColor(Color.MAGENTA);
        window.fillOval(x-20,y-20,w + 40, h + 40);
        window.setColor(Color.WHITE);
        window.fillOval(x-15, y-15, w + 30, h + 30);
        window.setColor(c);
        window.fillRect(x, y, w, h);
        window.clearRect(x + 4, y + 4, w - 8, h - 8);
        window.setColor(Color.black);
        window.fillOval(x + w/5, y + h/5, w/10, h/10);
        window.fillOval(x + w - w/3, y + h/5, w/10, h/10);
        window.drawArc(x + w/5 + w/20, y + 3*h/5, 4*w/5 - w/3,h/10,180,180);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return w;
    }

    public void setWidth(int w) {
        this.w = w;
    }

    public int getHeight() {
        return h;
    }

    public void setHeight(int h) {
        this.h = h;
    }

    public Color getColor() {
        return c;
    }

    public void setColor(Color c) {
        this.c = c;
    }
    
    public int getXSpeed() {
    	return xSpeed;
    }
    
    public void setXSpeed(int speed) {
    	this.xSpeed = speed;
    }
    
    public int getYSpeed() {
    	return ySpeed;
    }
    
    public void setYSpeed(int speed) {
    	this.ySpeed = speed;
    }
    
    public String toString()
   {
   	return x+" "+y+" "+w+" "+h+" "+c;
   }
    
}