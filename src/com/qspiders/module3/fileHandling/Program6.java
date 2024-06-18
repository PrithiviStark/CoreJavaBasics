package com.qspiders.fileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Program6
{
	public static void main(String[] args) throws Exception
	{
		Circle c=new Circle();
		c.color="BLUE";
		c.radius=15;
		FileOutputStream fos=new FileOutputStream("D:/3CCW3/FILEIO/Repository.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		System.out.println("Serialization Completed");
		oos.close();
		fos.close();
		
	}
}
