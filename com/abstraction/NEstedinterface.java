package com.abstraction;
//nested interface declear with in a class

class A{
	
	
	interface msg{
		void msg();
		interface display{
			void print();
		}
	}
	
}


public class NEstedinterface  implements A.msg.display{

	
	public static void main(String[] args) {
		A.msg.display m=new NEstedinterface();
		m.print();
		
	}

	
	public void msg() {
		System.out.println("HEllo nested interface");
	}


	@Override
	public void print() {
		System.out.println("Hello nested g");
	}

}
