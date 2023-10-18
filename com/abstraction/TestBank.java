package com.abstraction;

abstract class Bank{
 abstract int rateofIntrest();
}
class SBI extends Bank{
	int rateofIntrest() {
		return 9;
	}
	
}
class ICICI extends Bank {
	int rateofIntrest() {
		return 8;
	}
}
public class TestBank {

	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println("Rate of intest is"+b.rateofIntrest()+ " %");
		b=new ICICI();
		System.out.println("Rate of intest is"+b.rateofIntrest() +" %");
	}

}
