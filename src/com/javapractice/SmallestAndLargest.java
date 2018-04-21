package com.javapractice;

import java.util.Arrays;

public class SmallestAndLargest 
{

	public static void main(String[] args) 
	{
		int numbers[] = {-999 , 10, 22, -32, 4453, -9, 0};
		
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i]<smallest)
			{
				smallest = numbers[i];
			}
			else if(numbers[i]>largest)
			{
				largest = numbers[i];
			}
		}
		
		System.out.println("Array Number List: "+Arrays.toString(numbers));
		System.out.println("Largerst Number: "+largest);
		System.out.println("Smallest Number: "+smallest);
	}

}
