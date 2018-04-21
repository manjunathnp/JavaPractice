package com.javapractice;

public class PlayAround 
{

	public static void main(String[] args) 
	{
		String s1[] = {"Hello", "duplicate", "duplicate", "test"};
		
		for(int i=0; i<s1.length; i++)
		{
			for(int j=i+1; j<s1.length; j++)
			{
				if(s1[i].equals(s1[j]))
				{
					System.out.println("Duplicate: "+s1[i]);
				}
			}
		}
	}

}
