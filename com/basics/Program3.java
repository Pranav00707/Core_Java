package com.basics;
import java.util.Scanner;

class Studentname1{
	
	
	int id;
	String name;
}
public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Studentname s2=new Studentname();
		System.out.println("Enetr a no and name");
		s2.id=sc.nextInt();
		s2.name=sc.next() ; 
		System.out.println(s2.id);
	    System.out.println(s2.name);

	}

}
