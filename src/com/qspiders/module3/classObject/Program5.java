package com.qspiders.classObject;
class Connection
{
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Close Connection");
	}
}
public class Program5 
{
	public static void main(String[] args) 
	{
		Connection con=new Connection();
		System.gc();//CALL GARBAGE COLLECTOR
		con=null;
		System.gc();//CALL GARBAGE COLLECTOR
	}
}
