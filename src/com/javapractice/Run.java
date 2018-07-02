package com.javapractice;

interface Car //Car - Similar to WebDriver Interface
{
	public void start();
	public void accelerate();
	public void stop();
}

class Benz implements Car //Benz - Similar to Firefox Driver
{
	public void start()
	{
		System.out.println("Car Started...");
	}
	
	public void accelerate()
	{
		System.out.println("Car Accelerated..");
	}
	
	public void stop()
	{
		System.out.println("Car Stopped");
	}
}

public class Run 
{
	public static void main(String[] args)
	{
		Car c =	new Benz();
		c.start();
		c.accelerate();
		c.stop();
		
	}
    
    
   
}
