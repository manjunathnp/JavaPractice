package com.javapractice;

public class StaticNonStatic 
{
	//Static Variables
	static int a = 10;
	static double b = 23.5;
	static String c = "Static String";
	
	//Non-Static Variables
	int x = 100;
	double y = 20.45;
	String str = "Non-Static String";
	
	//Static Method
	public static void m1()
	{
		System.out.println("Inside Static Method m1");
	}
	
	//Non-Static Method
	public void m2()
	{
		System.out.println("Inside Non-Static Method m2");
	}

	public static void main(String[] args) 
	{
		System.out.println("Programs Starts");
		
		System.out.println("Accessing Static Members");
		System.out.println(StaticNonStatic.a);
		System.out.println(StaticNonStatic.b);
		System.out.println(StaticNonStatic.c);
		StaticNonStatic.m1();
		
		System.out.println("Accessing Non-Static Members");
		StaticNonStatic sn = new StaticNonStatic();
		System.out.println(sn.x);
		System.out.println(sn.y);
		System.out.println(sn.str);
		sn.m2();
		
		System.out.println("Program Ends");
	}

}
