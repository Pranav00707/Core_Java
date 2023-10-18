package com.basics;

abstract class Bik11 {

  abstract void run();

}
class Honda extends Bik11{

	@Override
	void run() {
		System.out.println("Running ");
		
	}
	public static void main(String[] args) {
		Bik11 b=new Honda();
		b.run();
	}
	
}
