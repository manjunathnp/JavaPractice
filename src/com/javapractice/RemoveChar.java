package com.javapractice;

public class RemoveChar 
{

	public static void main(String[] args) 
	{
		String s1 = "!@#!@#! Hello @!#@!# World!";
		
		//Regular Expression
		String s1Res = s1.replaceAll("[^a-zA-Z0-9' ']", "");
		System.out.println(s1Res);
	}

}
