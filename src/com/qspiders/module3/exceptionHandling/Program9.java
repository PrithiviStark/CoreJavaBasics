package com.qspiders.exceptionHandling;
class OverSpeedException extends Exception
{
	
}
public class Program9 
{
	static void checkVehicleSpeed(int speed) throws OverSpeedException
	{
		if(speed>80)
			throw new OverSpeedException();
		else
			System.out.println("No Stop");
	}
	public static void main(String[] args) 
	{
		try
		{
			checkVehicleSpeed(50);
			checkVehicleSpeed(70);
			checkVehicleSpeed(100);
		}
		catch(OverSpeedException e)
		{
			e.printStackTrace();
		}
	}
}