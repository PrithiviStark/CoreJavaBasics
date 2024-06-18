package com.qspiders.exceptionHandling;

public class Program4 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("try starts");
			System.out.println(10/2);
			System.out.println("try ends");
		}
		catch(ArithmeticException e)
		{
			System.out.println("/ By Zero");
		}
		finally
		{
			System.out.println("nayanathara");
		}
	}
}
