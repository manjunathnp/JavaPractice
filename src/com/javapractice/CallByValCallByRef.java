package com.javapractice;

public class CallByValCallByRef 
{
	int p, q;
	
	public static void main(String[] args) 
	{
		int x = 100;
		int y = 200;
		
		CallByValCallByRef obj = new CallByValCallByRef();
		//Call By Value
		obj.sum(x, y);
		
		obj.p = 10;
		obj.q = 20;
		
		//Call By Reference
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		
	}
	
	public int sum(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	public void swap(CallByValCallByRef t)
	{
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}
	

}
