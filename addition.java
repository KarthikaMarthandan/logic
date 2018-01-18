package package2;

import java.util.Scanner;

public class addition {
	int a,b;
	void getdata()
	{
		System.out.println("Enter the value a");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the value b");
		b=sc.nextInt();
	}
	void display()
	{
		System.out.println("value a="+a);
		System.out.println("value a="+b);
	}

}
