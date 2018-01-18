package Str;
import java.util.*;
public class com {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1, str2;
	      Scanner s = new Scanner(System.in);
	 
	      System.out.println("Enter First String");
	      str1 = s.nextLine();
	 
	      System.out.println("Enter Second String");
	      str2 = s.nextLine();
	 
	      if(str1.equalsIgnoreCase(str2))
	      {
	         System.out.println("given strings are equal.");
	      }
	      else
	      {
	         System.out.println("given strings r not equal");
	      }
	}

}
