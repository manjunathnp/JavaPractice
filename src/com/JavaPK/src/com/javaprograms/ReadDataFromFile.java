package com.javaprograms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromFile 
{

	public static void main(String[] args) throws IOException 
	{
		/*// Approach-1
		FileReader fr = new FileReader("C:\\Selenium\\Infos\\SampleTextFile.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
		
		br.close();*/
		
		
		/*// Approach-2
		File file = new File("C:\\Selenium\\Infos\\SampleTextFile.txt");
		
		Scanner sc = new Scanner(file);	
		
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();*/
		
		
		// Approach-3
		File file = new File("C:\\Selenium\\Infos\\SampleTextFile.txt");
		
		Scanner sc = new Scanner(file);	
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
		sc.close();
	}

}
