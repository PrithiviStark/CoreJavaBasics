package com.qspiders.classObject;
class Employee
{
	int empId=101;
	int deptNo=20;
	@Override
	public boolean equals(Object obj) 
	{
		Employee emp=(Employee)obj;
		if(this.empId==emp.empId&&this.deptNo==emp.deptNo)
			return true;
		else
			return false;
	}
}
public class Program4 
{
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		System.out.println(e1.equals(e2));
	}
}
