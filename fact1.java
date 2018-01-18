package contronl;
import java.util.Scanner;

public class fact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, i, fact = 1;
		 
	      System.out.println("Enter the number");
	      Scanner sc = new Scanner(System.in);
	 
	      n = sc.nextInt();
	 
	      if ( n < 0 )
	         System.out.println("Number should be non-negative.");
	      else
	      {
	         for ( i = 1 ; i <= n ; i++ )
	            fact = fact*i;
	 
	         System.out.println("Factorial of "+n+" is = "+fact);
	      }
		
	}

}
