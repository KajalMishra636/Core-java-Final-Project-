package Day_16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//8. Validation Indian Mobile Numbers Using Regular Expressions 

public class p15 {

	public static void main(String[] args) {
		
		//Sample mobile number to be validated 
		String mobileNumber = "9834749822";  //Should be 10 digits starting wth 7, 8,or 9
		
		//Regular expression to validate Indian mobile number 
		//Explanation : 
		 // ^            => Start of string
        // [789]        => First digit must be 7, 8, or 9
        // \\d{9}       => Followed by exactly 9 digits (total 10 digits)
        // $            => End of string
		String regex = "^[789]\\d{9}$";
		
		//Compile  regex pattern 
		Pattern pattern = Pattern.compile(regex);
		
		
		//Create matcher to apply the pattern on the input number
          Matcher matcher = pattern.matcher(mobileNumber);
          
          //Validate and dislay result 
          if (matcher.matches()) {
        	  System.out.println("Valid Indian mobile number. ");
          }else {
        	  System.out.println("Invalid Indian mobile number.");
          }
	}

}
