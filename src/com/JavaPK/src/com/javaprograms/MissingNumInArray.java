package com.javaprograms;

public class MissingNumInArray {

	public static void main(String[] args) 
	{
		// Arrays should not have duplicates
		// Values should be in range
		
		int a[] = {1, 2, 4, 5};
		
		//sum1 = 1+2+3+4+5 = 15
		//sum2 = 1+2+4+5 = 12
		//missing = sum1 - sum2 >> 3
		
		int sum1 = 0;
		for(int i=1; i<=5; i++)
		{
			sum1 = sum1 + i;
		}
		
		int sum2 = 0;
		for(int i=0; i<a.length; i++)
		{
			sum2 = sum2 + a[i];
		}
			
		int missing = sum1 - sum2;
		System.out.println("Missing Number: "+missing);

	}

}
