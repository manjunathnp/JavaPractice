package com.javaprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		if(num > 1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i == 0)
					count++;
				
			}
			if(count == 2)
			{
				System.out.println(num+ " is PRIME NUMBER");
			}
			else
			{
				System.out.println(num+" is NOT PRIME NUMBER");
			}
		}
		else
		{
			System.out.println(num+ " Not a Prime Number");
		}
				
	}

}
