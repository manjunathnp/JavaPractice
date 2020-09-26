package com.javaprograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		//Logic_1 - Algorithm
		int rev=0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		//Logic_2 - using StringBuffer Class
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev_ = sb.reverse();
		
		
		//Logic_3 - using StringBuilder Class
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev__ = sbl.reverse();
		
		
		System.out.println("Reverse Number is: "+rev__);
		System.out.println("Reverse Number is: "+rev_);
		
		

	}

}
