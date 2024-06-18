package com.qspiders.basics;
class Version
{
	int a;
	int b;
	void operation()
	{
		
	}
}
class Version1
{
	int a;
	int b;
	void operation()
	{
	if(a==b)
	{
	 System.out.println("version 1.0");
	}	
	}
Version1(int num,int val)
	{
	a=num;
	b=val;
	}
}
class Version2
{
	int a;
	int b;
	void operation()
	{
		if(a==b)
			System.out.println("version2-if");
		else
			System.out.println("version2-else");
	}
Version2(int num,int val)
	{
	a=num;
	b=val;
	}
}
class Version3
{
	int a;
	int b;
	void operation()
	{
		if(a<b)
			System.out.println("version3-if");
		else if(a>b)
			System.out.println("version3-elseIf");
		else
			System.out.println("Version3-else");
	}
Version3(int num,int val)
	{
	a=num;
	b=val;
	}
}
class Version4
{
	int a;
	int b;
	void operation()
	{
		if(a>b)
		{	
			System.out.println("version4-if");
			if(a+b<100)
				System.out.println("version4-if-if");
			else
				System.out.println("version4-if-else");
		}
		else
		{
			System.out.println("version4-else");
			if(a+b>100)
				System.out.println("version4-else-if");
			else
				System.out.println("version4-else-else");
		}
	}
Version4(int num,int val)
	{
	a=num;
	b=val;
	}
}
public class IfStatement 
{
public static void main(String[] args) 
{
	Version1 v1=new Version1(10,10);
	Version2 v2=new Version2(10,10);
	Version3 v3=new Version3(10,10);
	Version4 v4=new Version4(10,10);
	v1.operation();
	v2.operation();
	v3.operation();
	v4.operation();
}
}
