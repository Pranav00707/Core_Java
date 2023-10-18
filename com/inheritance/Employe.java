package com.inheritance;

public class Employe {
int id;
String name;
Address address;
public Employe(int id, String name, Address address)
{this.id=id;
this.name=name;
this.address=address;
	
}
void display()
{
	System.out.println(id+"   " +name);
	
	System.out.println(address.city+" "+address.state+" "+address.country);
	System.out.println();
}

	public static void main(String[] args) {
		Address a1=new Address("gx","up","India");
		Address a2=new Address("gx","up","India");
		
		Employe e1=new Employe(111,"pranav",a1);
		Employe e2=new Employe(111,"pra",a2);
		e1.display();
		e2.display();
		
	}

}
