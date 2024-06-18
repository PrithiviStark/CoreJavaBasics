package com.qspiders.exceptionHandling;
class Delta
{
	void test() {
		System.out.println("Executing test().....");
	}
}
public class Program3 
{
	static void instantiate() 
	{
		try
		{
			Delta d=(Delta)Class.forName("com.qspiders.exceptionHandling.Delta").newInstance();
			d.test();
		}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String[] args)
	{
		instantiate();
	}
}