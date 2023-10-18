package com.inheritance;

class Single{
	 void print() {
		System.out.println("This is a single level inheritance");
	}
}
public class SingleLevel extends Single{

	public static void main(String[] args) {
		Single s=new Single();
		s.print();
	}
	

}
