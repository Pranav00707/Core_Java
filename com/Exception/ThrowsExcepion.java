package com.Exception;
import java.util.*;
import java.io.IOException;

class Throwss{
	void myMethod(int num)throws IOException, ClassNotFoundException {
		if(num==1) 
			throw new IOException("IOException oCCURE");
		else
			throw new ClassNotFoundException("Class not found exception");
	}
}
public class ThrowsExcepion {

	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		
		Throwss t=new Throwss();
		t.myMethod(a);
	}

}
