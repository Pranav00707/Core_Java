package com.basics;
class InstanceMethod{
	//Instance method
	void add(int a, int b)
	{
		System.out.println("Addition is "+(a+b));
	}
	
}

public class StaticMethod {
public static void main(String[] args) {
	
	InstanceMethod in=new InstanceMethod();
	in.add(34, 16);
	name();
}
// STAtic mathod
static void name() {
	System.out.println("Pranav");
	
	
}
}
