package com.javaprograms;

import java.util.Arrays;

public class CheckArraysEquality {

	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3, 4, 5};
		int b[] = {0, 2, 3, 4, 5};
		
		//Approach 1:
		/*boolean status = Arrays.equals(a, b);
		
		if(status)
			System.out.println("Arrays are Equal");
		else
			System.out.println("Arrays are Not Equal");*/
		
		//Approach 2
		boolean status = true;
		
		if(a.length == b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i] != b[i])
				{
					status = false;
				}
			}
		}
		else
		{
			status = false;
		}
		
		if(status == true)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are Not Equal");
		}

	}

}
