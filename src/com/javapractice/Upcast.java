package com.javapractice;

class A
{
	int i;
}

class B extends A
{
	int j;
}




public class Upcast 
{

	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		
		B b1 = new B();
		b1.i = 20;
		b1.j = 30;
		
		//Upcasting
		A a2 = new B();
		System.out.println(a2.i);
		
		A a3 = (A) new B();
		a3.i = 100;
		
		B b2 = new B();
		A a4 = b2;
		a4.i = 200;
	}

}
