/*
	Program: Number Swap - without using Temp (3rd Variable)
	Author: Manjunath N P
*/
package com.javapractice;

public class NumSwapWithoutTemp 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 5;
		
//		//1. Using "+" Operator
//		System.out.println("Before Num Swap: ");
//		System.out.println("The Value of a: "+a);
//		System.out.println("The Value of b: "+b);
//		
//		a = a+b; //15
//		b = a-b; //10
//		a = a-b; //5
//		
//		System.out.println("After Num Swap: ");
//		System.out.println("The Value of a: "+a);
//		System.out.println("The Value of b: "+b);
		
//		//2. Using "*" Operator
//		System.out.println("Before Num Swap: ");
//		System.out.println("The Value of a: "+a);
//		System.out.println("The Value of b: "+b);
//		
//		a = a*b; //50
//		b = a/b; //10
//		a = a/b; //5
//		
//		System.out.println("After Num Swap: ");
//		System.out.println("The Value of a: "+a);
//		System.out.println("The Value of b: "+b);
		
		//3. Using "XOR" Bitwise Operator "^"
		System.out.println("Before Num Swap: ");
		System.out.println("The Value of a: "+a);
		System.out.println("The Value of b: "+b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("After Num Swap: ");
		System.out.println("The Value of a: "+a);
		System.out.println("The Value of b: "+b);
		
		
		
	}

}
