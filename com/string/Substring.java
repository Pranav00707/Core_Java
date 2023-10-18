package com.string;

public class Substring {
//Public stringsubstring (int start index)
	/*this method return new string object connecting the substring of the given string from specified
	 * startindex (inclusive) the method throws an indexoutof bound Exception when the start index is larger than the length of string or less than a zero
	 * 	 * 
	 */
//Public stringsubstring (int start index end index)
	/*this method return new string object connecting the substring of the given string from specified Startindex to endindex 
	 * the method throws an indexoutof bound Exception when the start index is less than zero or startindex is grater than end index is grater thn lengthe os string
	 */
	
	
//Syntax
	/*
	 * public String substring(int startindex)//type 1
	 * and
	 * public String substring(int startindex, int endindex)//type 2
	 * 
	 */
	public static void main(String[] args) {
		String s1="Pranav";
		System.out.println(s1.substring(2,4));
		System.out.println(s1.substring(4));
	}
	
}
