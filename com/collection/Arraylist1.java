package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
		
		arr.add("pranav ");//["Pranav"]
		arr.add("hello ");//["Pranav", "Hello"]
		
		arr.add(0, "baseball ");
		arr.add("arav");
		arr.add(1, "basketball");
		arr.add(1, "ball");
		arr.add("Zebra");
	//	arr.remove(2);	
		
		System.out.println(arr.size());

		System.out.println(arr.get(2));
		
		
		for(String str:arr) {
			System.out.println(str);
		}
		System.out.println("*********************After Sort************************");
		Collections.sort(arr);
		
		for(String str:arr) {
			System.out.println(str);
		}
		
		System.out.println("********************Reverse Order Sort************************");
		Collections.reverse(arr);
		for(String str:arr) {
			System.out.println(str);
			System.out.println("********************Reverse Order Sort************************");
			
		}
		}

}
