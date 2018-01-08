package package3;

import java.util.Scanner;

import package1.perfect;
import package1.prime;
import package2.addition;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=s.nextInt();
		prime p=new prime(n);
		perfect p1=new perfect();
		p1.get1();
		
		

	}

}
