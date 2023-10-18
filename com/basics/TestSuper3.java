package com.basics;
class car{
car() {
	System.out.println("Car is created");	
	}
}
class maruti extends car{
	maruti()
	{
		super();
		System.out.println("Swift is created");
	}
	
}
public class TestSuper3 {

	public static void main(String[] args) {
		maruti m=new maruti();
	System.out.println();
	
	
	}

}
