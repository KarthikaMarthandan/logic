package string;

import java.util.Scanner;

public class stri {
int n,m,s;
String s1,s2;
Scanner sc=new Scanner(System.in);
void getdata()
{
	System.out.println("Eneter the string");
	s1=sc.next();
}
void getdata1()
{

	System.out.println("Eneter the string 1");
	s1=sc.next();

	System.out.println("Eneter the string 2");
	s2=sc.next();
}
void lower()
{
	s2=s1.toLowerCase();
	System.out.println("LOWER CASE :"+s2);
}
void upper()
{
	s2=s1.toUpperCase();
	System.out.println("LOWER CASE :"+s2);
}
void con()
{
	System.out.println("Concatenating the string"+s1.concat(s2));
}
}

