package com.javapractice;

public class Singleton 
{
	//Special Class which can have only one object at a time
	//How to design Singleton Class?
	//1. Make Constructor as Private
	//2. Write a Public Static Method(getInstance) that has return type of the object of this Singleton Class(Lazy Initialization)
	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton()
	{
		str = "Hey this is Sigleton Class Illustration";
	}
	
	public static Singleton getInstance()
	{
		if(singleton_instance==null)
		{
			singleton_instance = new Singleton();
		}
		return singleton_instance;
	}
	

	public static void main(String[] args) 
	{
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}
