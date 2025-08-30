package Day_15;

public class pp2 {

	public static void main(String[] args) {
	  //Initialize  with a given first name (e.g from user data)
		String str1 = "Sachin";
		
		//concatenation:
		//we appends the surname to the name using concat()
        // and reassign the result to strl-since String are immutable,
		//concat()  return a new string.
		//Now strl refers to "SachinTendulkar"
		
		str1 =str1.concat("Tendulkar");
		
		//print the full name 
		System.out.println(str1);       //output:SachinTendulkar
		
		//Real-world example :Appening surname from user profile data 
		 // - First name pulled from database/API
        // - Surname supplied or retrieved separately
        // - We build the full name by combining them

}
}