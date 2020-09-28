package com.javaprograms;

public class CountCharOccurences {

	public static void main(String[] args) 
	{
		String str = "Count the Occurences Program";
		
		int totalCharacters = str.length();
		
		int afterRemoval = str.replaceAll("r", "").length();

		int count = totalCharacters-afterRemoval;
		
		System.out.println("Number of Occurances of 'r' : "+count);
	}

}
