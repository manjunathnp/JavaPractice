package com.javaprograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) 
	{
		String str = "Program to   remove    white     spaces";
		
		String newstr = str.replaceAll("\\s", "");
		
		System.out.println(newstr);
		
		

	}

}
