package com.javaprograms;

public class ReverseWords {

	public static void main(String[] args) 
	{
		/*// Original String
		String str = "To Reverse this String";
		
		// Splitting Strings into Words
		String[] words = str.split(" ");
		
		String reverseString = "";
		
		for(String w:words)
		{
			String reverseWord = "";
			
			for(int i=w.length()-1; i>=0; i--)
			{
				reverseWord = reverseWord + w.charAt(i);
			}
			
			reverseString = reverseString + reverseWord + " ";
		}
			
		System.out.println("Reversed String: "+reverseString);*/
		
		// Original String
		String str = "To Reverse this String";
		
		// Splitting Strings into Words
		String[] words = str.split("\\s");
		
		String reverseString = "";
		
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reverseString = reverseString + sb.toString() + " ";
		}
		
		System.out.println("Reversed String: "+reverseString);
		
	}

}
