package com.javaprograms;

public class SumOfArray 
{

	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3, 4, 1};
		
		int a_len = a.length;
		int sum = 0;
		
		/*for(int i=0; i<a_len; i++)
		{
			sum = sum+a[i];
		}*/
		
		//Enhanced for loop
		for(int value:a)
		{
			sum = sum+value;
		}
		
		System.out.println("Sum of Array Elements: "+sum);
				

	}

}
