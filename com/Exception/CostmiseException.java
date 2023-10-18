package com.Exception;
import java.util.*;
class NotEligibleToVote extends RuntimeException{
	NotEligibleToVote (String s){
		super(s);
	}
}
public class CostmiseException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a AGe");
	
	int age=sc.nextInt();
	if (age<18) {
		throw new NotEligibleToVote("Your age is less than 18");
	}
	else {
		System.out.println();
	}
	
	
}

}
