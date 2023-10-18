package com.lambdavalue;
interface MyInterFace1{
	int reverse(int i);
}
class Interger1 implements MyInterFace1{

	@Override
	public int reverse(int i) {
		int reverse=0;
	while(i!=0)
	{
		int reminder=i%10;
		reverse =reverse*10+ reminder;
		i=i/10;
	}
	
	return i;
}
}
public class ReverseNumber {
	
	public static void main(String[] args) {
		MyInterFace1 ref2 = (in)->{
			
			return in;
			
		};
		
		System.out.println("lambda "+ref2)
;
		MyInterFace1 i=new Interger1();
		//i.reverse(7676);
		System.out.println(ref2.reverse(7676));
		 

	}
	
}
