package com.lambdavalue;
class GenericsClass1 <T extends Number>{
	public void display(int a) {
		System.out.println("This is a boundedgeneric class");
	}
}
public class GenericBounddType {

	public static void main(String[] args) {
		GenericsClass1<Integer> obj=new GenericsClass1<>();
		obj.display(3);
		System.out.println("bh");
	}

}
