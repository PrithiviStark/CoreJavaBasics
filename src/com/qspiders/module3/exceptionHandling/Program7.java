package com.qspiders.exceptionHandling;
class CustomException extends Exception//1
{
	 
}
public class Program7 
{
	static void logic(int num) throws CustomException//2
	{
		if(num%3==0&&num%5==0)
			throw new CustomException();
		else
			System.out.println("All is Well");
	}
	public static void main(String[] args) 
	{
		try
		{
			logic(10);
			logic(15);
		}
		catch(CustomException e)
		{
			System.out.println("Custom Exception has Occurred");
		}
	}
}
