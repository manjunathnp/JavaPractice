package com.javapractice;

import java.util.Scanner;

public class Scrible 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int temp, total=0;
		
		int number = num;
		
		while (number != 0)
		{
			temp = number % 10;
			total = total +(temp*temp*temp);
			number = number / 10;
		}
		
		if(total == num)
			System.out.println(num+ " is ARMSTRONG NUMBER");
		else
			System.out.println(num+ " is NOT ARMSTRONG NUMBER");
		
	}
	
}
