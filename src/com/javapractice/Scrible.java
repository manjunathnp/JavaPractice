package com.javapractice;

import java.util.Scanner;

public class Scrible 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		final int n = sc.nextInt();
		
		if(isPrime(n))
			System.out.println(n+" is Prime Number");
		else
			System.out.println(n+" is not a Prime Number");
			
	}
	
	public static boolean isPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		for (int i=2; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
			
		}
		return true;
	}

}
