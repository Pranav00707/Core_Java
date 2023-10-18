package com.basics;
//invoke parent class method


class Animal1{
	
	void eat1() {
		System.out.println("animals  are eating");
	
	}
}
class Dog1 extends Animal1{
void eat1()
{
System.out.println("Dog are eatig roti");	
}

void bark1()
{
	System.out.println("DOg is Barking");
} 
    void work1() {
    	 super.eat1();
    }
   
}
public class Supmethod12 {

	public static void main(String[] args) {
	Dog1 d=new Dog1();
	d.work1();
	
	}

}
