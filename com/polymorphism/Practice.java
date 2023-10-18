package com.polymorphism;


public class Practice {
public static int i=0;
	Practice(){
		
		i++;
		
	}

	public static void main(String[] args) {
		Practice p=new Practice();
		Practice p1=new Practice();
		System.out.println("No of object Created:"+i);
	}
	

}
//In java distraction of object from memory is done automatically by the jvm
//when there is no reference to an object then that object is assume to be no longer needed and the memory occupid by thr objrct are relese
//it is calls garbage collection, This is done by JVM

//can Garbage collection be forcrd expicitely
//ANS no, We may request jvm for garbager collection by calling System.gc()
//Advntages
/* Programmer dose not need to worry about unsed objects
 * It is done automitacally by jvm
 * increases memory effiency
 * 
 * 
 */

//*Finalize method-
/*Sometimes an object we need to perform some specific taskbefore it is destoryed such as closing and open connection or releasing any resources held
 * To handle this we use finalize method is use
 * 
 * Finalise method is called by Garbage collection thread before collecting ObJ It is the last chance For any objectto perform inuf utility
 * 
 * Syntax 
 * 
 * protected void finalise method(){}
 * -It is define in java.Lang.Object class there fore it available for all the classes
 * -it is decleared AS procted inside object class
 * -It get call only once by gc threads
 
 */

//* -GC method - It is use to call gr=arbage collector expictilly however it dose not gurranty that jvm eill prfom garbage collection
/*It is only request jvm for garbage collection
 * This method is present System and runtime class
 * 
 */


