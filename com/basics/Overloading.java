package com.basics;
class Add{
	static int addiTion(int a,int b) {
		return a+b;
		
	}
	static int addiTion(int a, int b, int c) {
		return a+b+c;
		
	}
	static double addiTion(double a,int b) {
		return a+b;
		
	}
}

public class Overloading {

	public static void main(String[] args) {
System.out.println("Addition is="+Add.addiTion(4, 5));
System.out.println("Addition is="+Add.addiTion(4, 5,6));
System.out.println("Addition is="+Add.addiTion(4.86473674, 5));



		

	}

}
