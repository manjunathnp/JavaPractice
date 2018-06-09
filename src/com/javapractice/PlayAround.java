package com.javapractice;

import java.util.Scanner;

public class PlayAround 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of NUM1:");
		double num1 = sc.nextInt();
		System.out.println("Enter value of NUM2:");
		double num2 = sc.nextInt();
		System.out.println("Enter value of NUM3:");
		double num3 = sc.nextInt();
		
		double average = (num1+num2+num3)/3;
		
		System.out.println("Average of "+num1+","+num2+","+num3+" = "+average);
		
	}
	

}
