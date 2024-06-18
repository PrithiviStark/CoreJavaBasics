package com.qspiders.wrappers;

public class Program1 
{
	public static void main(String[] args) 
	{
		int a=15;
		Integer ref=new Integer(a);//BOXING
		System.out.println(ref);
		
		double d=8.65;
		Double obj=d;//BOXING
		System.out.println(obj);
		
		char c='Q';
		Character ch=c;//BOXING
		System.out.println(ch);
	}
}
