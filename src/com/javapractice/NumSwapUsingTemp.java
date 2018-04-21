/*
	Program: Number swap using Temp
	Author: Manjunath N P
*/
package com.javapractice;

import java.util.Scanner;

public class NumSwapUsingTemp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Num2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swap: \nNum1 = "+num1+"\nNum2 = "+num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swap: \nNum1 = "+num1+"\nNum2 = "+num2);

	}

}
