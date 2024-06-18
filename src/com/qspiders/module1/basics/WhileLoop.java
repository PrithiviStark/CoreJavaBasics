package com.qspiders.basics;
class WhileLoops
{
	int a;
	void operation()
	{
		while(a>0)
		{
			System.out.println("mithran");
			a--;
		}
	}
WhileLoops(int num)
{
		a=num;
}
}
class DoWhileLoop
{
	int a;
	void operation()
	{
		do
		{
			System.out.println("mithran");
			a--;
		}
		while(a>0);
	}
DoWhileLoop(int num)
{
a=num;	
}
}
public class WhileLoop
{
public static void main(String[] args) 
{
WhileLoops w1= new WhileLoops(0);
DoWhileLoop w2 =new DoWhileLoop(0);
w1.operation();
w2.operation();
}
}
