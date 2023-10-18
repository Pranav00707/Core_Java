package com.abstraction;
interface Drawable{
	void draw();
}
class Rectangle2 implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle2 implements Drawable{
	public void draw() {
	System.out.println("Draeing  Circle");	
	}
}
public class TsetInterface1 {

	public static void main(String[] args) {
		Drawable d=new  Circle2();
		d.draw();
		
		Drawable c=new Rectangle2()	;
		c.draw();
		
	}

}
