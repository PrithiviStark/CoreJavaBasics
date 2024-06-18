package com.qspiders.exceptionHandling;

public class Program6 
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		disp();
		System.out.println("main ends");
	}
	static void disp()
	{
		System.out.println("disp starts");
		test();
		System.out.println("disp ends");
	}
	static void test()
	{
		System.out.println("test starts");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("/ By Zero");
		}
		System.out.println("test ends");
	}
}
