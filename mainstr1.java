package string;

import java.util.Scanner;

public class mainstr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stri d=new stri();
		int ch,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("THE CHOICE ARE :");
		System.out.println("THE LOWER CASE :");
		System.out.println("THE UPPERCASE :");
		System.out.println("THE CONCATENATION :");
		do
		{
			System.out.println("Enter ur choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				d.getdata();
				d.lower();
				break;
			case 2:
				d.getdata();
				d.upper();
				break;
			case 3:
				d.getdata();
				d.con();
				break;
				default:
					System.out.println("INVALID OPTION");
					break;
					
			}
			System.out.println("want 2 continue r not :");
			c=sc.nextInt();
			
		}while(c==1);
		System.out.println("END OF COMPUTATION");
}
}

