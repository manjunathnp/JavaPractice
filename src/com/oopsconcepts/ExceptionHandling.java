package com.oopsconcepts;

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		int a = 10, b = 0;
		
		
		try
		{
			int res = a/b;
			System.out.println(res);
			
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

	
}
