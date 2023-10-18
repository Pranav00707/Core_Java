package com.polymorphism;
class Area1{
	public void area(double d) {
		System.out.println("Area oc circle is:"+(3.14*d*d));
	}
	
	public void area(int side) {
		System.out.println("Area of Square is:"+(side*side));
	}

	public void area(int length, int breath) {
		System.out.println("Area of REctanglw is:"+(length*breath));
	}
}




public class TestArea {

	public static void main(String[] args) {
	Area1 a=new Area1();
	a.area(34.5);
	a.area(6);
	a.area(4, 5);
  
	}

}
