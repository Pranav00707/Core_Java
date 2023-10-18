package com.inheritance;
//3dot operator or elipics
public class ThreeDotArgument {
static void display(String...values)
{
	for(String s:values) {
		System.out.println(s);
	}
	
}
	public static void main(String[] args) {
		display();
		display("Hello");
		display("bolo","Helo","dcd","dcdsc");
		

	}

}
