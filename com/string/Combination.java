package com.string;

public class Combination {

	public static void main(String[] args) {
		String str="Welcome to my worldd";
		int len=str.length();
		System.out.println("First Cherater :"+str.charAt(0));
		
		System.out.println("Last cheracter:"+str.charAt(len-1));
		
		System.out.println((len));
		
		//equales method-To Compare the values of the string
		
		String s="Pranav";
		String s1=new String("Pranav");
		
		if (s.equals(s1)) 
			System.out.println("String s1 and S2 are equals");
		else
			System.out.println("S1 and s2 are Not equal");
		
		System.out.println(s1.concat(" ").concat(str).concat(" ").concat(s));
		
		
		//Substring 
	}

}
