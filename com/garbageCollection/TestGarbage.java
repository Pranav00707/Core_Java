package com.garbageCollection;

public class TestGarbage {

	public static void main(String[] args) {
		TestGarbage t=new TestGarbage();
		t=null;
		System.gc();
		
		
		

	}
	public void finalize() {
		System.out.println("Finalize method object Destoryyyed");
	}

}
