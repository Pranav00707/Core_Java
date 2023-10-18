package com.basics;

class Human{
	void eat()
	{
		System.out.println("Human is eating");
	}
	void sleep()
	{
		System.out.println("human is sleepin");
	}
}
public class Boy extends Human {
	public void eat()
	{
		System.out.println("Boy is eating");
	}

	public static void main(String[] args) {
	Human h=new Human();
	h.eat();
 Boy b=new Boy();
 b.sleep();
b.eat();
	}

}
