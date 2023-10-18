package com.lambdavalue;

public class TestDemo {

	public static void main(String[] args) {
		DemoClass d=new DemoClass()
;
		
		d.<String>genericMethod("MY NAME ISS");
		d.<Integer>genericMethod(25);
	}

}
class DemoClass{
	public <T> void genericMethod(T data) {
		System.out.println("Generic method");
		System.out.println();
		System.out.println("Data passes : "+data );
	}
}