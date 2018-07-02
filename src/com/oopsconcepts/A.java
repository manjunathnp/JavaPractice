package com.oopsconcepts;

public class A 
{
	public static void main(String[] args)
	{
		System.out.println("main method of Class A");
		//B.main(args);
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println(s1.toString());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		StringBuffer s3 = new StringBuffer("Hello Java");
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb.reverse());

	}
}
