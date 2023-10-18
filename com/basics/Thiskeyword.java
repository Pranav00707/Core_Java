package com.basics;
class stdent{
	int rollno;
	String name;
	float fees;
	stdent(int rollno, String name , float fees)
	{
	this.rollno=rollno;
	this.name=name;
	this.fees=fees;
	}
	void display()
	{
	System.out.println(rollno+" "+name+" "+fees );
	}
}
public class Thiskeyword {
	
public static void main(String[] args) {
	stdent s1=new stdent(4,"Ts",643.86f);
	stdent s2=new stdent(4,"Ts",643.4f);
	s1.display();
	s2.display();
}
}
