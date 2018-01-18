package Str;
import java.util.*;
public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
	      Scanner s = new Scanner(System.in);
	 
	      System.out.println("Enter a string");
	      original = s.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse is: "+reverse);
	}

}
