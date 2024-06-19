package javalearn.basics;

import java.util.Scanner;

class Values {
	static int legalAge;
	static String YesNo;
	final double pi;
	boolean permit = true;
	String[] registerNames = new String[10];
	int[] registerAge = new int[10];
	static {
		legalAge = 18;
		YesNo = "Y";
	}
	{
		pi = 3.14;
	}
}

public class LearnScanners {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int age = 0;
		int registerNo = 0;
		String name = null;
		Values val=new Values();
		while (Values.YesNo.equalsIgnoreCase("Y") && registerNo < (val.registerNames.length-1)) {
			System.out.print("Enter your age :");
			age = scn.nextInt();
			
			if (age >= Values.legalAge) {
				System.out.print("Enter your name :");
				name = scn.next();
				val.registerNames[registerNo]=name;
				val.registerAge[registerNo]=age;
			} else {
				System.out.println("Sorry, your under age");
			}
			if (name != null) {
				System.out.println("Hi, Welcome to Java Scanners");
				System.out.println("your Registered No. :" + registerNo + "your Registered Details- Name :"+val.registerNames[registerNo]+", Age :"+val.registerAge[registerNo]);
				if (registerNo++ < 10) {
					System.out.print("Do you want to continue ?(Y/N) :");
					Values.YesNo = scn.next();
				} else {
					System.out.println("Register is Fully Occupied");
					for(int i=0;i<(val.registerNames.length-1);i++) {
						System.out.println("Registered Name :"+val.registerNames[i]+", Age :"+val.registerAge[i]);
					}
				}
			}
		}
		System.out.println("Thank You , Come again later");
	}

}
