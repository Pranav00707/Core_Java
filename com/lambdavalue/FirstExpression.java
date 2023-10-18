package com.lambdavalue;
interface MyInterface{
	double getPivalue();
}
public class FirstExpression {

	public static void main(String[] args) {
	
		MyInterface ref;
		ref =()->3.147;
		ref =()->4.147;
		System.out.println("Value of pi= "+ref.getPivalue());
		
	}

}
