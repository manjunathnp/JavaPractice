package com.javaprograms;

import java.util.Scanner;

public class Palindrome3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int orig = num;
		int rev=0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(orig == rev)
		{
			System.out.println("PANLINDROME");
		}
		else
		{
			System.out.println("Non-PALINDROME");
		}
		
		

	}

}
