package com.javaprograms;

import java.util.Scanner;

public class Palindrome2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		String rev = "";
		
		char a[] = str.toCharArray();
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + a[i];
		}
				
		if(str.equals(rev))
		{
			System.out.println("PANLINDROME");
		}
		else
		{
			System.out.println("Non-PALINDROME");
		}

	}

}
