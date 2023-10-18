package com.Exception;



public class NumberFOrmat {
public static void main(String[] args) {
	String str="JAVA";
	try {
		int  i=Integer.parseInt(str);
		
		
		
	}
	catch (NumberFormatException e) {
		System.out.println(e.getMessage());
		System.out.println(e.getLocalizedMessage());
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

}
//write a java program ovel persent in a string