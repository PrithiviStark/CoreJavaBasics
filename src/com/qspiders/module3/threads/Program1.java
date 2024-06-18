package com.qspiders.threads;
class DemoThread extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Demo thread.....");
		}
	}
}
public class Program1 
{
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		DemoThread dt=new DemoThread();
		dt.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread.....");
		}
		System.out.println("Program Ends");
	}
}
