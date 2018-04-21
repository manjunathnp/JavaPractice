package com.javapractice;

public class IfElseDemo {

	public static void main(String[] args) 
	{
		int a = 100;
		int b = 300;
		int c = 400;
	
		if(a > b && a > c) 
		{
			System.out.println("a is the largest");
		}
		else if(b > a && b > c)
		{
			System.out.println("b is the largest");
		}
		else if(c > a && c > b)
		{
			System.out.println("c is the largest");
		}
		else
		{
			System.out.println("The numbers are not distinct");
		}
		
	}

}
