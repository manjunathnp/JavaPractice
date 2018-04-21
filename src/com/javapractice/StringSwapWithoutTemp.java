/*
	Program: String Swapping without using Temp
	Author: Manjunath N P
*/
package com.javapractice;

public class StringSwapWithoutTemp 
{
	public static void main(String[] args) 
	{
		String a = "Java";
		String b = "Selenium";
		
		//Before String Swap
		System.out.println("Before String Swap:");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
		
		//1. Append a and b
		a = a+b; //JavaSelenium
		
		//2. Store initial string a in b
		b = a.substring(0, a.length()-b.length()); //12-8=4
		
		//3. Store initial string b in a
		a = a.substring(b.length());
		
		//After String Swap
		System.out.println("After String Swap:");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
		

	}

}
