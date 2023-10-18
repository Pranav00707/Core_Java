package com.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linklist1 {

	public static void main(String[] args) {
		LinkedList<String> s = new LinkedList<>();
		s.add("mango");
		s.add("orange");
		s.add("banana");
//	System.out.println(s.element());
		/*
		 * Iterator<String> s1=s.iterator(); while (s1.hasNext()) {
		 * System.out.println(s1.next());
		 */

		System.out.println("***********************************************");
		Collections.sort(s);
		System.out.println(s);

		System.out.println("***********************************************");
//s.remove();
		//System.out.println(s);
		System.out.println("***********************************************");
		LinkedList<String> s2 = new LinkedList<>();
		s2.addAll(s);
		System.out.print(s2);
		System.out.println("***********************************************");
		
		//System.out.print(s2.get(0));
		
		System.out.println("************************For***********************");
		for (int num = 0; num < s.size(); num++) {
			System.out.println(" " + s.get(num));
		}
			System.out.println("**********************for each*************************");
			for (String str : s) {
				System.out.println(s);
				
		}
			System.out.println("**********************   While   *************************");
		int num=0;
		while(s.size()>num) {
			System.out.println(s.get(num));
			  num++;
		}
		
		System.out.println("**********************   ADDFIRT AdDLAST *************************");
		s.addFirst("Pranaba");
		s.addLast("OMMMMMM");
		System.out.println(s);
		
		
		

	}

}
