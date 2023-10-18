package com.inheritance;

public class ThreedotopInt {
	void show(int...is)
	{
		for(int s:is) {
			
			System.out.println(s);
		}
	}
	void show(double...d)
	{

for(double f:d) {
			
			System.out.println(f);
		}
	
}
		
		
	public static void main(String[] args) {
		ThreedotopInt t=new ThreedotopInt();
		t.show(45);
		t.show(45.8436);
		t.show(458.87687);
		t.show(44,3,4,32,3,4,324);	}

}
