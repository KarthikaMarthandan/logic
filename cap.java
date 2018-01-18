package Str;
import java.util.*;

public class cap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	     System.out.print("enter the word: ");
		 String line =s.nextLine();
		 String upper_case_line = ""; 
	       Scanner sc = new Scanner(line); 
	         while(sc.hasNext()) {
	             String word = sc.next(); 
	             upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
	         }
	         System.out.println(upper_case_line.trim()); 
	}

}

