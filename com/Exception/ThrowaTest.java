package com.Exception;
import java.util.*;
public class ThrowaTest {
	static void checkEligiblity(int a, int b) {
		if(a<12 && b<40) {
			throw new ArithmeticException("Student are not Allowed ");
		}
		else
			System.out.println("Student entry is Valid");
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age to check eligibility");
	int age=sc.nextInt();
	System.out.println("Enter weight to check eligibility");
	
	int weight=sc.nextInt();
	checkEligiblity(age,weight);
	
}
}
