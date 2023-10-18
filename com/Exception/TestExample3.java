package com.Exception;

import java.util.Scanner;

class InvalidProductException extends Exception{
	public InvalidProductException(String s) {
		super(s);
	}
	void viewProduct(int weight) throws InvalidProductException {
		if (weight<100) {
			throw new InvalidProductException("Product Inalid");
		}
		else
			System.out.println("Valid");
	}
}
public class TestExample3 {
public static void main(String[] args) {
	System.out.println("Enter a Weight");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	InvalidProductException i=new InvalidProductException("");
	try {
		i.viewProduct(num);
		
	} catch (InvalidProductException e) {
		//System.out.println("Catch the exceptions");
		System.out.println(e.getMessage());
	}
}
}
