package com.javaprograms;

public class EvenOddFromArray 
{

	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3, 4, 5, 6};
		
		int a_len = a.length;
		
		System.out.println("Even Numbers: ");
		for(int i=0; i<a_len; i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Odd Numbers: ");
		for(int i=0; i<a_len; i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
