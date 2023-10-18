package com.Exception;

public class ArethameticException {

	public static void main(String[] args) {
		int num1=23,num2=0;
		try {
		
			int num3=num1/num2;
			System.out.println(num3);
			
			
		} 
		
	/*	catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}*/
		catch (Exception e) {
			System.out.println(e);
			//System.out.println("DIvide by zero");
	}
		
		
}
}
