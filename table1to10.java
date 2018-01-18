package contronl;
import java.util.Scanner;
public class table1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   
		  System.out.print("Input a number: ");
		  int n = sc.nextInt(); 
		  if (n<=10)
		  {
			 for (int i=0; i< 10; i++)
			{
			  System.out.println(n + " x " + (i+1) + " = " + (n * (i+1)));
		    }
		  }
			 else
				 System.out.println(" Enter number from 1 to 10");
			 
				  
		  }

	}


