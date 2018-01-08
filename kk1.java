package inter;
import java.io.*;
import java.util.Scanner;

public class kk1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=null;
		kk b=new kk();
		System.out.println("STUDENT NAME:");
		name=sc.next();
		System.out.println("The student name:"+b.stuname(name));
		

	}

}
