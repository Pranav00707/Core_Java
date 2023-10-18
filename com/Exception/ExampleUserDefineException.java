package com.Exception;
class MyException extends Exception
{
	String str1;
	
	MyException(String str2){
		str1=str2;
	}
	public String toString() {
		return ("My Exception Occure :" +str1);
		
	}
}
public class ExampleUserDefineException {
public static void main(String[] args) {
	
	try {
		System.out.println("String of try block");
		throw new MyException("This is error message");
		
	} catch (Exception e2) {
		System.out.println("Catch block");
		System.out.println(e2.getMessage());
	}
	
}
}
