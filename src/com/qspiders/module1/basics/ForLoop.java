package com.qspiders.basics;

import java.util.Scanner;

public class ForLoop 
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);
System.out.println("enter square size");
int num=scn.nextInt();
for(int i=0;i<num;i++)
{
	for(int j=0;j<num;j++)
	{
		if(i==j || i+j==num-1)
		System.out.print("*"+" ");
		else
			System.out.print(" "+" ");
	}
	System.out.println();
}
}
}
