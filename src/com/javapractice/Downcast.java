package com.javapractice;

class C
{
	int i;
}

class D extends C
{
	int j;
}


public class Downcast {

	public static void main(String[] args) 
	{
		C a1 = new D();
		D b1 = (D) a1;// Downcasting
		
		b1.i = 10;
		b1.j = 20;
		
	}

}
