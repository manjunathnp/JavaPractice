package com.javaprograms;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//Logic1 - using + (String Concatenation) operator
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		String rev = "";
		
		System.out.println("Original String: "+str);
		
		//Logic_1 - Using charAt()
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		
		//Logic_2 - Using toCharArray()
		char a[] = str.toCharArray();
		int len_ = str.length();
		
		for(int i=len_-1; i>=0; i--)
		{
			rev = rev + a[i];
		}
		
		
		//Logic_3 - Using StringBuffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reversed String: "+sb.reverse());
		
		//System.out.println("Reversed String: "+rev);
	}

}
