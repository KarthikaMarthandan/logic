package contronl;
import java.util.Scanner;

public class big3 {

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
	     System.out.println("Enter first number A: ");
	     int a = in.nextInt();
	     System.out.println("Enter second number B: ");
	     int b = in.nextInt();
	     System.out.println("Enter third number C: ");
	     int c = in.nextInt();
	     int largest = Math.max(a, Math.max(b, c));
	     System.out.println("Largest among THREE NUMBER is" + largest);
	     int smallest = Math.min(a, Math.min(b, c));
	     System.out.println("Smallest among THREE NUMBER is: "+ smallest);

	}

}
