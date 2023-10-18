package com.polymorphism;
class Animal{	
String color="black"	;
}
class Dog extends Animal{
	String color="white";
	void princolor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
class Cat extends Animal{
	String color="gray";
	void princolor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class TestColor {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.princolor();
		
		System.out.println();
		
		Cat c=new Cat();
		c.princolor();
	}

}
