package com.qspider.passingAndReturnObject;
import java.util.Scanner;
class Account
{
 int cid;
 long accNumber;
 Account(int a,long b)
 {
	 cid=a;
	 accNumber=b;
 }
}
class AccManager
{
 static void displayAccDetails(Account acc)	
 {
	 System.out.println("id number :"+acc.cid);
	 System.out.println("Accounut number :"+acc.accNumber);
 }
 static Account createAccount()
 {
	 Scanner scn=new Scanner(System.in);
	 System.out.println("enter customer id");
	 int id= scn.nextInt();
	 System.out.println("enter Account number");
	 long num= scn.nextLong();
	 Account ac = new Account(id,num);
	 return ac;
 }
}
public class Bank 
{
public static void main(String[] args)
{
	Account a1=AccManager.createAccount();
	AccManager.displayAccDetails(a1);
}
}
