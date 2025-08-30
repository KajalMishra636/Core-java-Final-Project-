package Day_16;

//java program to convert primitive into objects 
//Autoboxing example of int to integer 
public class P19 {

	public static void main(String[] args) {
		
		//primitive int value 
		int a = 20;
		
		//converting int into integer explicitly using valueof() method 
		Integer i = Integer.valueOf(a);       //manual Boxing 
		
		//Autoboxing : compiler automatically converts int to integer
		//This line is internally treated as : Integer j= integer.valueof(a);
		
Integer j= a;

//Displaying all values to show they are the same 
System.out.println( a + " " + i + " "+ j );
	}

}
