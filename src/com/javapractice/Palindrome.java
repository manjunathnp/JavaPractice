package com.javapractice;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String str = "Madam";
		String rev = "";
		int strLen = str.length();
		
		for(int i=strLen-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
			
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(rev+" is PALINDROME");
		}
		else
		{
			System.out.println(rev+" is NOT PALINDROME");
		}
		
		
		
	}

}
