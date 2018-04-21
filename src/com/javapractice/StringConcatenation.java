package com.javapractice;

public class StringConcatenation 
{

	public static void main(String[] args) 
	{
		int a = 100; int b = 200;
		
		double c = 32.22; double d = 21.21;
		
		String x = "Hello"; String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x);
		System.out.println(b-a+x);
		System.out.println(a+b+y);
		System.out.println(b-a+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a);
		System.out.println(x+y+b);
		System.out.println(x+y+a+b);
		System.out.println(x+d+a+b+y);
		System.out.println(x+y+(a+b)+(c+d));
		
		
	}

}
