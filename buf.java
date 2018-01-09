package string;

import java.util.Scanner;

public class buf {
 String s1,s2;
 Scanner sc=new Scanner(System.in);
 void get()
 {
	 System.out.println("Enter the first String:");
	 s1=sc.next();
	 System.out.print("Eneter the second string:");
	 s2=sc.next();
	 
 }
 void apps()
 {
	 StringBuffer st1=new StringBuffer(s1);
	 StringBuffer st2=new StringBuffer(s2);
	 System.out.print("String append is:"+st1.append(st2));
 }
}
