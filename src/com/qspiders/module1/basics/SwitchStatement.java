package com.qspiders.basics;
import java.util.Scanner;
public class SwitchStatement 
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int s=scn.nextInt();
	System.out.print("your input is :");
switch(s)	
{
	case 1:
		System.out.println("1");
		break;
	case 2:
		System.out.println("2");
		break;
	case 3:
		System.out.println("3");
		break;
	default:
		System.out.println("not valid");
}
}
}
