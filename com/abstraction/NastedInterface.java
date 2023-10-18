package com.abstraction;
interface displayable{
	void show11();
	interface messager{
		void msg();
	}
}
public class NastedInterface implements displayable.messager {

	
	
	public static void main(String[] args) {
		displayable.messager message=new NastedInterface(); 	
   message.msg();
   NastedInterface d=new NastedInterface();
  d.show11();
	}

	

	
	
	
	public void msg() {
	System.out.println("Hello nested interface");
		
	}
	public void show11() {
		System.out.println("SHowwww");
	}

}
