package com.basics;
import java.util.Scanner;
public class methods6 {



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num=sc.nextInt();
		findEvenOdd(num);
		sc.close();
		
	}
	public static void findEvenOdd(int num)
	{
		if(num%2==0)
			System.out.println("Number"+num+"is even");
		else
			System.out.println("Number"+num+"is odd");
		
	}
	

}
