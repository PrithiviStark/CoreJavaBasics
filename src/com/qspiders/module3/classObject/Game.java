package com.qspiders.classObject;

public class Game implements Cloneable
{
	int hiscore=0;
	
	static void createCopy() throws CloneNotSupportedException
	{
		Game ref=new Game();
		ref.hiscore=5000;
		Game copy=(Game)ref.clone();
		System.out.println(copy.hiscore);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		createCopy();
	}
}