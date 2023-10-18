package com.abstraction;
abstract class Bike{
	abstract void run();
	
}
public class Hero extends Bike {


	@Override
	void run() {
	System.out.println("Running Safelyy");
	}
public static void main(String[] args) {
		
Bike b=new Hero();
b.run();
	}

}
