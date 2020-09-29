package com.javaprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("C:\\Selenium\\Infos\\SampleTextFile_2.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with Java\n");
		bw.write("Selenium with C#\n");
		bw.write("Selenium with Python\n");
		bw.write("Selenium with Perl\n");
		bw.write("Selenium with PHP\n");
		bw.write("Selenium with Ruby\n");
		bw.write("Selenium with JavaScript");
		
		bw.close();
	}

}
