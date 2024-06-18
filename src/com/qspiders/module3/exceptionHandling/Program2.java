package com.qspiders.exceptionHandling;

public class Program2 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		String str=null;
		try
		{
			System.out.println(str.charAt(23));
		}
		catch(NullPointerException e)
		{
			System.out.println("Operation With Null Reference");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index Value");
		}
		
		System.out.println("Program Ends");
	}
}
