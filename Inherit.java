package inherit;
import java.io.*;
import java.util.*;
public class Inherit {

	String rno;
	String name;
	void get1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the roll no");
		rno=sc.nextLine();
		System.out.println("Eneter the name");
		name=sc.next();
		
		
	}
	void put1()
	{
		System.out.println("ROLL NO"+rno);
		System.out.println("Name"+name);
	}
}
