package com.javaprograms;

public class WordsCountStr 
{

	public static void main(String[] args) 
	{
		String str = "Count Words in a  test String";
		
		System.out.println(str.split("\\s+").length);
		
		
		System.out.println(wordCount(str));
		
	}

	private static int wordCount(String str) 
	{
		int count = 1;
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == ' ' && i < str.length() && str.charAt(i + 1) != ' ') 
			{
				count++;
			}
		}
		return count;
	}
}




