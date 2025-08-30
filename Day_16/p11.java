package Day_16;

//3.  Replacing All Digit in aa string Using Regular Expressions 
public class p11 {

	public static void main(String[] args) {

		//Sample input string containing digit (a phone number in this case)
		String input = "My phone is 123-456-7890.";
		
		//Regular expression to match any single digit from 0 to 9
		// \d => Representing a digit (equivalent to [0-9])
		String regex = "\\d"; //Note : We use double blackslash \\ to escape inJava strings 
		
		//Replace all digits in the input string with an asterrisk (*)
		String result = input.replace(regex, "*");
		
		//print the result after replacing all digits
		 // Expected output: My phone number is ***-***-****.
		System.out.println(result);
	}

}
