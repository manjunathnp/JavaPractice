package com.javaprograms;

public class Swap1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping: a="+a+" "+"b="+b);
		
		//Logic_1 - using Temporary (third) variable
		  int temp = a;
		  a = b;
		  b = temp;
		
		//Logic_2 - using + & -
		   a = a+b;
		   b = a-b;
		   a = a-b;
		
		//Logic_3 - using * & /
		   a = a*b;
		   b = a/b;
		   a = a/b;
		
		//Logic_4 - using XOR
		  a = a^b;
		  b = a^b;
		  a = a^b;
		
		//Logic_5 - using single statement
		  b = a+b - (a=b);
		
		System.out.println("After swapping: a="+a+" "+"b="+b);
		
		

	}

}
