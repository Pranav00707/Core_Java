
package com.abstraction;

interface Bank4{
	float rateofIntrest1();
}
class ICICI3 implements Bank4{

	public float rateofIntrest1() {
		return 9;
	}
	
}
class BOB implements Bank4{

	
	public float rateofIntrest1() {
		
		return 10;
	}
	
}

public class TestInterface3 {

	public static void main(String[] args) {
	Bank4 b=new ICICI3();
				b.rateofIntrest1();
;
		
		System.out.println("ROI: "+b.rateofIntrest1());
	}

}
