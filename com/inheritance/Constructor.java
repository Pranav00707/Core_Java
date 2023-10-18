package com.inheritance;
class Print{
	//Deafult con
	Print(){
		System.out.println("MY NAME IS >>>>>>>>>>>>>");
	}
	Print(int a, String name)
	{
		System.out.println(a);
		System.out.println(name);
	}
	Print(int b){
		System.out.println(b);
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		
Print p=new Print();
Print yu=new Print(7,"Pranav");

Print a=new Print(76);

 
	}

}
