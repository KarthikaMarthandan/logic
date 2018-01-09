package patt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class pat {

		
		 public boolean isPatternMatching(String line){
		     
		        Pattern ptn = Pattern.compile("\\d{2}$");
		        Matcher mtch = ptn.matcher(line);
		        if(mtch.find()){
		            return true;
		        }
		        return false;
		    }
		     
		    public static void main(String a[]){
		        pat p = new pat();
		        System.out.println("Is 'h23'? "+p.isPatternMatching("h23"));
		        System.out.println("Is 'hl'? "+p.isPatternMatching("hlo"));
		    }
		 

	}


