package com.basics;

class Mamals{
	
 void eat() {
System.out.println("MAmlas are eat");
	}
}
class Lion extends Mamals{
  void sleep() {
	System.out.println("Lion are sleeping");
}
	
}
class Tiger extends Mamals{
	 void hungry() {
		System.out.println("Tiger are Hungry");
	}
	
}
public class Hearchiacal15 {

	public static void main(String[] args) {
		
 Tiger t=new Tiger()	;
 t.eat();
 Lion l=new Lion();
 l.sleep();
 }

}
