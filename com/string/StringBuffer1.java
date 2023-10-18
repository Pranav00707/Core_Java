package com.string;

public class StringBuffer1 {

	public static void main(String[] args) {
		//JAva string buffer is used to created a mutable string objects. The strig buffer class in java s the same as the String clas except iit ues  multiple or it can  be change
     /*NOTE
      * JAva string buffer is THRESD SAFE I.E MULTIPLE THREADS 	cannot access it simeltineously so it is safe and will result in an order
      * 
      */
		StringBuffer sb=new StringBuffer("Hello ");
		//sb.append("Java ");
		
	/*	sb.append("Pranav ");
		System.out.println(sb);
		sb.append("javvaa"); 
		System.out.println(sb);
//Insert method in java
		*/
		/*
		sb.insert(3, "Pra");
		System.out.println(sb);
		sb.insert(7, "nav");
		System.out.println(sb);
		*/
		
//replace
//		sb.replace(0, 3,"cha");
	//	System.out.println(sb);
		
//Delete
		//sb.delete(1, 3);
//		/System.out.println(sb);
		
//reverse
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
