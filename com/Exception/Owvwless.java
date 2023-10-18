package com.Exception;

import java.util.*;

public class Owvwless {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String To Find a vowels");		
String s=sc.nextLine();
		
;
		int count=0;
	
	for(int i = 0;i<s.length();i++) {
		if (s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u') {
			
			System.out.println("voWele are:"+s.charAt(i));
      count++;
		}
	}
	System.out.println("no of vowels are"+count);
	}
}

