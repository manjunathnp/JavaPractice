package com.javaprograms;

public class Swap1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping: a="+a+" "+"b="+b);
		
		//Logic1 - using Temp(third) variable
		/*int temp = a;
		  a = b;
		  b = temp;*/
		
		//Logic2 - using + & -
		/* a = a+b;
		   b = a-b;
		   a = a-b;*/
		
		//Logic3 - using * & /
		/* a = a*b;
		   b = a/b;
		   a = a/b;*/
		
		//Logic4 - using XOR
		/*a = a^b;
		  b = a^b;
		  a = a^b;*/
		
		//Logic5 - using single statement
		b = a+b - (a=b);
		
		System.out.println("After swapping: a="+a+" "+"b="+b);
		
		

	}

}
