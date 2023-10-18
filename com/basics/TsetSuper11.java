package com.basics;
//Write a proger psrrnt clas instace variabke

class Animal{
	String color = "white";
}
class Dog extends Animal{
	String color ="Brown";
	void color()
	{
		System.out.println(color);
		System.out.println(super.color);
		
	}
}


public class TsetSuper11{

	public static void main(String[] args) {
		Dog d=new Dog();
		d.color();
	}
}
