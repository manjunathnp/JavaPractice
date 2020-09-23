package com.javaprograms;

import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the Second Number: ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter the Third Number: ");
		int n3 = sc.nextInt();
		
		//Logic1 - using comparison operator and &&
		/*if(n1>n2 && n1>n3)
		{
			System.out.println(n1+ " is the Largest Number");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+ " is the Largest Number");
		}
		else
		{
			System.out.println(n3+ " is the Largest Number");
		}*/
		
		//Logic2 - Using Ternary operator
		int largest1 = n1>n2?n1:n2;
		int largest2 = n3>largest1?n3:largest1;
		System.out.println(largest2+" is the largest number");
		
		
		
		
		

	}

}
