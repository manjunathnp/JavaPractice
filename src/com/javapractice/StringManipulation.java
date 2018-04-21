package com.javapractice;

public class StringManipulation 
{

	public static void main(String[] args) 
	{
		String str = "This is String Manipulation class";
		String str1 = "This is String manipulation class";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println(str.indexOf("is"));
		
		System.out.println(str.indexOf("hello")); //-1
		
		//string comparison
		System.out.println(str.equals(str1));
		
		//substring
		System.out.println(str.substring(0, 14));
		
		//trim
		String s = "    Hello World   ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		
		String date = "01/01/2019"; //01-01-2019
		System.out.println(date.replace("/", "-"));
		
		//split
		String test = "Hello_World_Test_Selenium";
		String testVal[] = test.split("_"); //Split
		for(int i=0; i<testVal.length; i++)
		{
			System.out.println(testVal[i]);
		}
		
		//Concat
		String s2 = "How are you?";
		System.out.println(s2.concat(s));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b); //imp
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		System.out.println((x+y)+a+b);
		
	}

}
