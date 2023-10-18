package com.abstraction;
abstract class Bike11{
	Bike11(){
		System.out.println("Bike is Created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear Changed");
	}
}
class Honda1 extends Bike11{
	@Override
	void run() {
		System.out.println("RUnning Safely");
	}
}

public class TestBike {
public static void main(String[] args) {
	Bike11 b1=new Honda1();
	b1.run();
	b1.changeGear();
	
}
}
