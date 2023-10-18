package com.basics;

class Empolyee{

	int Empid;
	String name;
	double sal;
	void insertRecord( int i, String s, double a)
	{
		Empid=i;
		name=s;
		sal= a;
	}
	void printRecord()
	{
		 
		System.out.println(Empid+" "+name+" "+sal);
	}
	
}
public class ObjClass5 {

	public static void main(String[] args) {
	;
		Empolyee e2=new Empolyee();
		Empolyee e3=new Empolyee();
		Empolyee e4=new Empolyee();
		
		e2.insertRecord(2, "Pankaj", 111.3);
		e3.insertRecord(12, "Pank", 111);
		e4.insertRecord(112, "Paj", 11.3);
		e2.printRecord();
		e3.printRecord();
		e4.printRecord();
	}

}
