package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ArrayListInt {
public static void main(String[] args) {
	ArrayList<Integer> i=new ArrayList<>();
	i.add(33);
	i.add(878);
	i.add(0, 65);
	
	System.out.println("*********************Befor Sort************************");
	for (Integer integer : i) {
		System.out.println(i);
	}
	System.out.println("*********************After Sort************************");
Collections.sort(i);
for (Integer integer : i) {
	System.out.println(i);
}
}
}
