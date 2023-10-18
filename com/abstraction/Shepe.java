package com.abstraction;


abstract class Shape{
abstract void draw();
}
class Rectangke extends Shepe{

	void draw() {
		System.out.println("Drawing Rectanle");
	}
	
}
class circle extends Shepe{

	void draw() {
	System.out.println("Drawing circle");
		
	}
	
}
public class Shepe {
	public static void main(String[] args) {
		circle s=new circle();
		s.draw();
	
}
}