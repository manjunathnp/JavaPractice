package com.javapractice;

public class ArraysDemo 
{

	public static void main(String[] args) 
	{
		int a[] = new int[4];
		
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		System.out.println(a[3]);
		System.out.println(a.length);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		double b[] = new double[3];
		b[0] = 12.22;
		b[1] = 43.21;
		b[2] = 11.09;
		
		System.out.println(b[0]);
		
		for (int j=0; j<b.length; j++)
		{
			System.out.println(b[j]);
		}
		
		char c[] = new char[3];
		c[0] = 'c';
		c[1] = '@';
		c[2] = '1';
		
		System.out.println(c[1]);
		
		for (int k=0; k<c.length; k++)
		{
			System.out.println(c[k]);
		}
		
		boolean d[] = new boolean[2];
		d[0] = true;
		d[1] = false;
		
		System.out.println(d[0]);
		
		String s[] = new String[3];
		s[0] = "This is STRING #1";
		s[1] = "This is STRING #2";
		s[2] = "This is STRING #3";
		
		System.out.println(s[1]+" "+s[2]);
		System.out.println(s.length);
		
		Object obj[] = new Object[5];
		obj[0] = "Hello";
		obj[1] = "Bengaluru";
		obj[2] = 3;
		obj[3] = '$';
		obj[4] = '!';
		
		System.out.println(obj.length);
		System.out.println(obj[0]+" "+obj[1]);
		
				
	}

}
