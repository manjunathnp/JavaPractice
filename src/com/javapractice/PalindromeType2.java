package com.javapractice;

public class PalindromeType2 
{
	public static void main(String[] args) 
	{
		String str;
		str = "malayalam";
		String rev = "";
		
		int strLen = str.length();
		
		for(int i=strLen-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
			
		}
		

		if(rev.equalsIgnoreCase(str))
		{
			System.out.println(str+ " is a PALINDROME!");
		}
		else
		{
			System.out.println(str+ "is NOT A PALINDROME!");
		}
		
	}
	

}
