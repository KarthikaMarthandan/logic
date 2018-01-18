package Str;

import java.util.Scanner;

public class traial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x[]=new String[10];
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the number of string");
			int n=s.nextInt();
			System.out.println("Enter the string");
			for(int i=0;i<=n;i++)
			 x[i]=s.nextLine();
		 String upper_word = ""; 
		 while(s.hasNext()) {
	             upper_word += Character.toUpperCase(upper_word.charAt(0)) +upper_word.substring(1) + " "; 
	         }
	}

}
