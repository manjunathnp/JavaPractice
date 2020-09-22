package com.javaprograms;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Entered Number: "+num);
		
		int count=0;
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		System.out.println("Number of Digits in entered Number: "+count);
	}
	

}
