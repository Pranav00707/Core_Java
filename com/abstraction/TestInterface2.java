package com.abstraction;
interface Printable1{
	void print();
}
interface Showable1{
	void print();
}

public class TestInterface2 implements Printable1,Showable1 {

	public static void main(String[] args) {
		TestInterface2 i=new TestInterface2();
		i.print();
		
	}

	public void print() {
	System.out.println("HEllo");
		
	}

}
