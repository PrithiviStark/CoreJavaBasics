package com.qspiders.basics;

import java.util.Scanner;

public class Array 
{
public static void main(String[] args) 
{
	Scanner scn =new Scanner(System.in);
	int[] a= {10,20,30,40,50};
	double[] b=new double[5];
	System.out.println("enter array value");
	for(int i=0;i<b.length;i++)
	{
		
		b[i]=scn.nextDouble();
		System.out.println(b[i]);
		}
	}
}
