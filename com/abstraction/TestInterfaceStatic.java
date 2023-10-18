package com.abstraction;
interface Drawabl{
	void draw();
	static int cube(int a, int b, int c) {
		return a*b*c;
	}
}
class Rectanglees implements Drawabl{

	
	public void draw() {
		System.out.println("Hello IAm drawing ractangle");
		
	}
	
}


public class TestInterfaceStatic {

	public static void main(String[] args) {
		Drawabl d=new Rectanglees();
		d.draw();
		System.out.println(Drawabl.cube(4,5,3));

	}

}
