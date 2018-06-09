package com.javapractice;

import java.util.Scanner;

public class Scrible 
{

	public static void main(String[] args) 
	{
		String str = "REVERSE";
		String rev = "";
		
		/*for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);*/
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
	}
}

//import java.util.Scanner;
/*public class Scrible {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
      //System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
        
        //int n1 = input / 100000 % 10;
        System.out.println((123456/10) % 10);

    }*/
