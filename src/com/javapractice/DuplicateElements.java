package com.javapractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements 
{

	public static void main(String[] args) 
	{
		String names[] = {"Java", "C#", "Python", "Ruby", "Perl", "Java", "C#"};
		
		for(int i=0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate Element: "+names[i]);
				}
			}
		}
		
		Set<String> store = new HashSet<String>();
		for(String name : names)
		{
			if(store.add(name) == false)
			{
				System.out.println("Duplicate Element: "+name);
			}
		}

	}

}
