package com.encapsulation;

class Empolye1{
	private int noOfEmoplyes =0;
	public void setnoOfEmoplyes(int count) {
		noOfEmoplyes=count;
	}
	public double getnoOfEmoplyes()
	{
		return noOfEmoplyes;
	}
	
}
public class Empolye {
	public static void main(String[] args) {
		Empolye1 e=new Empolye1();
		e.setnoOfEmoplyes(736);
		System.out.println("No of empolyes :"+(int)e.getnoOfEmoplyes());                                                                     
		
	}

}
