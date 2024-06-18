package com.qspiders.cframes;

public class Vehicle implements Comparable
{
	int priority;
	@Override
	public int compareTo(Object o) 
	{
		Vehicle v=(Vehicle)o;
		return this.priority-v.priority;
	}
	public Vehicle(int priority) 
	{
		this.priority=priority;
	}
	@Override
	public String toString() 
	{
		return "Vehicle Priority "+this.priority;
	}
}
