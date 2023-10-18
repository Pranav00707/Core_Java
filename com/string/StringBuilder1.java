package com.string;

public class StringBuilder1 {
////JAva stringBuilder is used to created a mutable string objects. The strig buffer class in java s the same as the String class except iit ues  multiple or it can  be change
	//It is a non Synchronized class
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Pranav ");
		//s.append("java");
//		System.out.println(s);
	   
		s.insert(2, "ja");
		System.out.println(s);
		
		s.replace(2, 4, "jk");
		System.out.println(s);
		
        s.delete(1, 3);
        System.out.println(s);
        
        s.reverse();
       System.out.println(s);
	}

}
