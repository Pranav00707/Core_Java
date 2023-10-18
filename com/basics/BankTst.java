package com.basics;
class Bank{
	
	int getRateofintrest()
	{
		return 0;
		
	}
}
class SBI extends Bank{
	int getRateofintrest()
	{
		return 7;
		
	}
}
class AXIS extends Bank{
	int getRateofintrest()
	{
		return 9;
		
	}
}
class ICICI extends Bank{
	int getRateofintrest()
	{
		return 6;
		
	}
}


public class BankTst {
public static void main(String[] args) {
	
	SBI s=new SBI();
	AXIS a=new AXIS();
	ICICI i=new ICICI();
	
	System.out.println( "sbi rate of intrest ="+s.getRateofintrest());
	
	System.out.println("Axis Rate of intrest="+a.getRateofintrest());
	
	System.out.println( "Icici Rate of intrest ="+	i.getRateofintrest());

}
}
