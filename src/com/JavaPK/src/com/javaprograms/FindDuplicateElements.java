package com.javaprograms;

import java.util.HashSet;

public class FindDuplicateElements {

	public static void main(String[] args) 
	{
		String arr[] = {"Java", "C", "C++", "Python","Java", "C", "C++", "C", "C++"};
		
		boolean flag = false;
		
		HashSet <String> hs = new HashSet();
		System.out.println("Duplicates: ");
		for(String str:arr)
		{
			if(hs.add(str) == false)
			{
				System.out.println(str);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("No Duplicates");
		}
		
	}

}
