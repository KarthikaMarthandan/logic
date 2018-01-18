package contronl;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		 int n, i, sc=0;
	        Scanner s = new Scanner(System.in);
			
	        System.out.print("Enter a Number : ");
	        n = s.nextInt();
			
	        for(i=2; i<n; i++)
	        {
	            if(n%i == 0)
	            {
	                sc++;
	                break;
	            }
	        }
	        if(sc == 0)
	        {
	            System.out.print("This is a Prime Number");
	        }
	        else
	        {
	            System.out.print("This is not a Prime Number");
	        }

	}

}
