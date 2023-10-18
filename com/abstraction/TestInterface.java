package com.abstraction;
interface printable{
	void print();
}

public class TestInterface  implements printable{
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		TestInterface t=new TestInterface();
		t.print();
	}

}
