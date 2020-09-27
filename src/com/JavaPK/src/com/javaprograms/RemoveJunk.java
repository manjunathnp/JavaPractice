package com.javaprograms;

public class RemoveJunk {

	public static void main(String[] args) 
	{
		String str = "!@#$%$#!@This is Java#@Programming";
		System.out.println(str);
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
