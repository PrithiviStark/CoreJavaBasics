package com.qspiders.threads;
class SampleThread implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Sample Thread.....");
		}
	}
}
public class Program2 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		SampleThread st=new SampleThread();
		Thread th=new Thread(st);
		th.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread.....");
		}
		System.out.println("Program Ends");
	}
}
