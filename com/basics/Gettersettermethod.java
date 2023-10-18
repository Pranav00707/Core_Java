package com.basics;
class main{
	
	private int rollno;
	private String name;
	public int getRollno()
	{
		return rollno;
		
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
		
	}
	public String getNmae()
	{
		return name;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void display(int rollno, String name)
	{
		System.out.println("Roll no "+rollno);
		System.out.println("NAMe "+name);
	}
}
class Gettersettermethod {

	
	
	public static void main(String[] args) {
		
		main m=new main();
		
	
		
		m.display(1,"Pranav");
	}

}
