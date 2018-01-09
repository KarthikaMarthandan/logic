package patt;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class pat2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="my mom told me to get 20 apple for 80 rupees";
		Pattern pat=Pattern.compile("friend ");
		Matcher mat=pat.matcher(ss);
		if(mat.find())
			System.out.println("PATTERN WAS FOUND");
		else
			System.out.println("PATTERN WAS NOT FOUND");
		

	}

}
