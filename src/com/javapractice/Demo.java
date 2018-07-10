package com.javapractice;

public class Demo 
{
	int m;
	int n;
	
	public void add(int x, int y)
	{
		int res = x+y;
		System.out.println(res);
	}
	
	public void swap(Demo obj)
	{
		int temp = obj.m;
		obj.m = obj.n;
		obj.n = temp;
	}
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		
		Demo d = new Demo();
		d.add(a, b); //Call By Value = Passing the values of a and b
		
		d.m = 100;
		d.n = 200;
		
		//Before swap
		System.out.println(d.m);
		System.out.println(d.n);
		
		d.swap(d);
		
		//After swap
		System.out.println(d.m);
		System.out.println(d.n);
		
		
		
		
		
				
		
		
	}
	

}
