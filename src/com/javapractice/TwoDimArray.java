package com.javapractice;

public class TwoDimArray 
{

	public static void main(String[] args) 
	{
		String x[][] = new String[2][2];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		x[0][0] = "A";
		x[0][1] = "B";
		
		x[1][0] = "C";
		x[1][1] = "D";
		
		System.out.println(x[0][0]);
		System.out.println(x[1][0]);
		
		for(int row=0; row<x.length; row++)
		{
			for(int col=0; col<x[0].length; col++)
			{
				System.out.println(x[row][col]);
			}
		}
				
		
		

	}

}
