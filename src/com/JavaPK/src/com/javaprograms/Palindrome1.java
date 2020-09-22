package com.javaprograms;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Non-Palindrome");
		}

	}

}
