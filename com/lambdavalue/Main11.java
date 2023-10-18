package com.lambdavalue;
interface MyyinterFace{
	String reverse(String n);
}
     class Main11 {

	public static void main(String[] args) {
	
		
		MyyinterFace ref1 = (str)->
		{String result=" ";
			for(int i=str.length()-1; i>=0;i--) 
				
				 result += str.charAt(i);
					return result;
				
		
			
			
			
			};
			System.out.println("lambda reverse" +ref1.reverse("lambda"));
		
	}
	
}
			
			
		
	
