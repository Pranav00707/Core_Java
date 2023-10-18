package com.inheritance;

public class OneobjAnotherobj {

	int id;
	String name;
	
	OneobjAnotherobj(int i, String s)
	{
		id=i;
		name=s;
		
	
	
	}
	OneobjAnotherobj()
	{
		
	}
void display()
{
	System.out.println(id);
    System.out.println(name);
	
}
	public static void main(String[] args) {
	
		OneobjAnotherobj o=new OneobjAnotherobj(7,"Pragca");
		OneobjAnotherobj a=new OneobjAnotherobj();
	a.id=o.id;	
	o.name=a.name;
	
	
	}

}
