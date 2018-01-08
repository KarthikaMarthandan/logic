package inherit;

import java.io.*;
import java.util.*;
public class Stud extends Inherit {

	String m1;
	String m2;
	String m3;
	Scanner sc=new Scanner(System.in);
	void get2()
	{
		System.out.print("Enter the marks:");
		System.out.println("Eneter the mark 1");
		m1=sc.nextLine();
		System.out.println("Eneter the mark 2");
		m2=sc.nextLine();
		System.out.println("Eneter the mark 3");
		m3=sc.nextLine();
	
		
	}
	void put2()
	{
		int tot;
		System.out.println("JAVA"+m1);
		System.out.println("OS"+m2);
		System.out.println("CD"+m3);
	}
}
