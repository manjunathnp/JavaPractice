package com.javaprograms;

public class MaxMinArray {

	public static void main(String[] args) 
	{
		
		int a[] = {20, 190, 0, -1};
		
		int max = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}

		System.out.println("Maximum Number in Array: "+max);
		
		int min = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		
		System.out.println("Minimum Number in Array: "+min);
		
	}

}
