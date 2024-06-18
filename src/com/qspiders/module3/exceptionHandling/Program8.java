package com.qspiders.exceptionHandling;
class MobileNumberException extends Exception//1
{
	
}
public class Program8 
{
	static void verifyMobileNumber(String mobile) throws MobileNumberException//2
	{
		if(mobile.length()!=10)
			throw new MobileNumberException();
		else
			System.out.println("Valid Number");
	}
	public static void main(String[] args) 
	{
		try
		{//3
			verifyMobileNumber("6364884447");
			verifyMobileNumber("6364884445");
			verifyMobileNumber("636488447");
		}
		catch(MobileNumberException e) {
			System.out.println("Invalid Mobile Number");
		}
	}
}
