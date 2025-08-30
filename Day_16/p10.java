package Day_16;

// Importing required classes for regular expression operations 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//2. Finding All Occurrence of a word in a given textt 


public class p10 {

	
	public static void main(String[] args) {
		 
		//simple input text in which we want to search a specific word 
		String text = "Java is a programming language. Java is also an island .";
		
		//The word to be searched for i the text (case -sensitive)
		String regex=" Java";
		
		//Compile the regex pattern
		Pattern  pattern = Pattern.compile(regex);
		
		//Create a matcher object to search the text using the compile pattern 
		Matcher matcher = pattern.matcher(text);
		
		//Use a loop to find all occurences of the word "Java"
		while (matcher.find()) {
			//Print the starting index of each match found 
			System.out.println("Found at index: " + matcher.start());
		}

	}

}
