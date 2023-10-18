package com.wrapperclass;

public class INTdouble {

	public static void main(String[] args) {
		int a=10;
	    double b=7.65;
	    //converts into wrapper class 
	    
	    Integer  aObj=Integer.valueOf(a);
	    Double bObj=Double.valueOf(b);
	    
	    if(aObj instanceof Integer) {
	    	System.out.println("An integer object is created");
	    }
	    if(bObj instanceof Double) {
	    	System.out.println("An double object is creates9");
	   }	}
}                  
