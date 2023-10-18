package com.Exception;



public class Combinationoffinally {

	public static void main(String[] args) {
		
		System.out.println(Combinationoffinally.myMethod());

	}
	public static int myMethod() {
	try {
		return 120;
		
	}
		finally {
			System.out.println("This is finally block");
			System.out.println("Finally block run event aher return statement");
		}
		
	}

}
