package excep;

import java.util.Scanner;

public class arith {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the first value:");
		a=s.nextInt();
		System.out.println("Enter the Second value:");
		b=s.nextInt();
	}
	void process()
	{
		try
		{
			c=a/b;
			System.out.println("ARITHMETIC"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("DIVISION BY ZERO");
		}
	}

}
