package package1;

import java.util.Scanner;

public class perfect
{   

	String rno;
	String name;
	public void get1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the roll no");
		rno=sc.nextLine();
		System.out.println("Eneter the name");
		name=sc.next();
		System.out.println("ROLLNO"+rno);
		System.out.println("name"+name);

}
}
