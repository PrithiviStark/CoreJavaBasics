package com.qspider.passingAndReturnObject;
import java.util.Scanner;
class Product
{
	int pid;
	double price;
	Product(int a,double b)
	{
		pid=a;
		price=b;
	}
}
class ProductUtility
{
	static Product createProduct(int id,double price)
	{
		Product pro = new Product(id,price);
		return pro;		
	}
	static void displayProductDetails(Product p)
	{
		System.out.println("ID :"+ p.pid);
		System.out.println("PRICE :"+ p.price);
	}
	static Product giveDiscount(Product p)
	{
		p.price = p.price-p.price*0.25;
		return p;
	}
}
public class Store
{
public static void main(String[] args) 
{
	Scanner scn = new Scanner(System.in);
	System.out.println("enter product id");
	int id= scn.nextInt();
	System.out.println("enter cost");
	double cost = scn.nextDouble();
	Product p1 =ProductUtility.createProduct(id,cost);  
	ProductUtility.displayProductDetails(p1);
	p1=ProductUtility.giveDiscount(p1);
	ProductUtility.displayProductDetails(p1);
}
}
