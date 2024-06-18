package com.qspider.passingAndReturnObject;
import java.util.Scanner;
class UserProfile
{
String userName;
String bioName;
UserProfile(String a,String b)
 {
	userName=a;
	bioName=b;
 }
}
class ProfileUtil
{
static void displayUser(UserProfile up)
{
System.out.println("username:"+up.userName);
System.out.println("bioname :"+up.bioName);
}
static UserProfile createUser()
{
Scanner scn=new Scanner(System.in);
System.out.println("enter username");
String uname=scn.next();
System.out.println("enter bio name");
String bname=scn.next();
UserProfile up=new UserProfile(uname,bname);
return up;
}
}
public class Insta 
{
public static void main(String[] args) 
{
	UserProfile u1=ProfileUtil.createUser();
	ProfileUtil.displayUser(u1);
}
}
