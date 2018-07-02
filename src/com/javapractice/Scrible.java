package com.javapractice;

import java.util.Scanner;

public class Scrible 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if (isPrime(num))
		{
			System.out.println("PRIME NUMBER");
		}
		else
		{
			System.out.println("NOT PRIME NUMBER");
		}
		
		
	}
	
	public static boolean isPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
			
		}
		return true;
	}
	
}

