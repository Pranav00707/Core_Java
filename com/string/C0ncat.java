package com.string;

public class C0ncat {
public static void main(String[] args) {
	String s="Pranav Pangavhane  ";
	String s1="Pranav ";
	s.concat("TEndulakar");
	System.out.println(s);//will print sachin beacuse Strings are imutable objects
	
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s);
	System.out.println(s.length());//calculate the length of the string
    System.out.println(s.indent(6));//string start with 6th position
    System.out.println(s.trim());// trim() it removes the white spaces
    System.out.println(s.startsWith("Pr"));//give values in bollen true or false
    System.out.println(s.endsWith("v"));
    System.out.println(s.charAt(0));//print the index value
    System.out.println(s.charAt(4));
    System.out.println(s.compareTo(s1));
    
 }
}
