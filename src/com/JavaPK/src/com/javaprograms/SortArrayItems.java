package com.javaprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayItems {

	public static void main(String[] args) 
	{
		Integer a[] = {10, 2, 20, 15, 22};
		
		System.out.println("Array Items Before Sort: "+Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Array Items After Sort[Descending]: "+Arrays.toString(a));

	}

}
