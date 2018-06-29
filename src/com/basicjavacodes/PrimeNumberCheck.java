/*
	Program: To check the given number is Prime or Not Prime
	Author: Manjunath N P

*/
package com.basicjavacodes;

import java.util.Scanner;

public class PrimeNumberCheck
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
	       System.out.print("Enter a number : ");
	       int n = s.nextInt();
	       
	       if(isPrime(n))
	       {
	    	   System.out.println(n + " is a prime number");
	       } 
	       else 
	       {
	           System.out.println(n + " is not a prime number");
	       }
	       
	}
	
	public static boolean isPrime(int n) 
	   {
	       if (n <= 1) 
	       {
	           return false;
	       }
	       for (int i = 2; i <= n/2; i++) 
	       {
	           if (n % i == 0) 
	           {
	               return false;
	           }
	       }
	       return true;
	   }

}
