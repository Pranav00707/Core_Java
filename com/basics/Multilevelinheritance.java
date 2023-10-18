package com.basics;
class car1{
	 void runningg() {
	System.out.println("Car is Running");	
	}
}
class Hundai extends car1{
	void run() {
	System.out.println("Hundai is running");
	}	
}
class creta extends Hundai
{
	void cretaRun()
	{
		System.out.println("Cretais Running");
	}
	
}
public class Multilevelinheritance {

	public static void main(String[] args) {
	
creta c=new creta();
c.runningg();
c.run();
c.cretaRun();
	}

}
