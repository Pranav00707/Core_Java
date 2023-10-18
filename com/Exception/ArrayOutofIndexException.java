package com.Exception;

public class ArrayOutofIndexException {

	public static void main(String[] args) {
	
	
	try {
		int arr[] =new int[7];
		arr[3]=3/0;
	System.out.println("First print Statemt in try block");	
	}
	catch (ArithmeticException e) {
		System.out.println("Arithemetic exception");
	
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Arry excwp");
	}
	
	/*catch (Exception e) {
	System.out.println(e.getMessage());	
	}*/
	finally {
		System.out.println("Im finally here");
	}
	}

}
