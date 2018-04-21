package com.javapractice;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		//String Reversal using for loop
		String str = "Hello";
//		System.out.println("Before String Reversal: "+str);
//		int strLen = str.length();
//		
//		String rev = "";
//		
//		for(int i = str.length()-1; i>=0; i--)
//		{
//			rev = rev + str.charAt(i);
//		}
//		
//		System.out.println("After String Reverse: "+rev);

		StringBuffer sf = new StringBuffer(str);
		System.out.println(sf.reverse());
	}

}
