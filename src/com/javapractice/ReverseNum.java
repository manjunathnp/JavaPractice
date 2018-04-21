package com.javapractice;

public class ReverseNum 
{
	public static void main(String[] args) 
	{
		int x = 54321;
		int rev = 0;
		
		while(x != 0)
		{
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		System.out.println("Reverse: "+rev);
		
		int a = 100;
		StringBuffer sf = new StringBuffer(String.valueOf(a));
		StringBuffer reverse = sf.reverse();
		System.out.println("Reverse:"+reverse);
	}
}
