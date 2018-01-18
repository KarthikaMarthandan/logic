package Str;
import java.util.*;

public class occur {
	int n,c=0,i;
	String r;
	String x[]=new String[10];
	void get()
	{
		System.out.println("Enter the number of string");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter the string");
		for(i=0;i<=n;i++)
			x[i]=s.nextLine();
	}
	void occurence()
	{
      System.out.println("Enter the word to searched");
      Scanner s=new Scanner(System.in);
      r=s.nextLine();
      for(i=0;i<=n;i++)
      {
    	 if(x[i].equals(r))
    			 c++;
      }
      if(c==0)
    	  System.out.println("String not found");
      else
    	  System.out.println("String found"+c+"times");
    }
}
