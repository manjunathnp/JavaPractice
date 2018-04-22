/*
	Program: To verify given number in Armstrong Number or Not
	Author: Manjunath N P
*/
package com.javapractice;

import java.util.Scanner;

public class ArmstronNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int number, temp, total = 0;
		
		number = num;
		while (number != 0)
		{
			temp = number%10;
			total = total + (temp*temp*temp);
			number = number/10;
			
		}
		
		if(total == num)
			System.out.println(num+" is an ARMSTRONG Number");
		else
			System.out.println(num+" is NOT ARMSTRONG Number");

	}

}
