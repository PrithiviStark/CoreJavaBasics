package com.qspiders.exceptionHandling;

public class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Program Ends");
	}
}
