package com.collection;

import java.util.ArrayList;

public class Addallmethod {
public static void main(String[] args) {
	ArrayList<String> s=new ArrayList<>();
s.add("Pranav");
s.add("India");
s.add("Keywoed");
s.add("hindi");
System.out.println("langauges:"+s);

ArrayList<String> s1=new ArrayList<>();
s1.addAll(s);
System.out.println("langauges:"+s1);

int size =s1.size();
System.out.println("Size of Arary elements:"+size);
System.out.println("********************************  TRIM TO SIZE METHOD  ****************************");
s1.trimToSize();
System.out.println(s1.size());
}
}
















 




