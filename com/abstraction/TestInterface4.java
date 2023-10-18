package com.abstraction;
interface Printablee{
	void print();
}
interface Showablee extends Printablee{
	void show()
;
	}


public class TestInterface4 implements Showablee{
	

	public static void main(String[] args) {
		TestInterface4 t=new TestInterface4();
		t.print();
		t.show();
	}

	
	public void print() {
		System.out.println("Hello");
		
	}


	public void show() {
		System.out.println("Welcome");
		
	}

}
