package com.Exception;

public class ovelsStringArray {
public static void main(String[] args) {
	String s=new String("pranav");
	int count=0;
	
	for(int i=0;i<s.length();i++) {
		if(s.indexOf(i)=='a' || s.indexOf(i)=='e'||s.indexOf(i)=='i'||s.indexOf(i)=='o'||s.indexOf(i)=='u' ) {
		
			
			count++;
		}
		
	}
	System.out.println("Count os ovwels are:"+count);
	
}
}
