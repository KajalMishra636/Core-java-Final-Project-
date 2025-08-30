package Day_15;

public class p2 {
//Program 12: Using StringBuffer
	
	public static void main(String[] args) {
		//Create a StringBuffer
		StringBuffer buffer = new StringBuffer("Hello");
		
		//print the initial capacity
		System.out.println("Initial capacity: " + buffer.capacity());

		
		//print the length
		System.out.println("Length: " + buffer.length());
		
		//print the string 
		System.out.println("string : " + buffer.toString());
		
		//Append a string 
		buffer.append("World!");
		
		//print the updated string 
		System.out.println("Update string: " + buffer.toString());
		
		//reverse the string
		buffer.reverse();
		
		//print the reversed string 
		System.out.println("Reversed string " + buffer.toString());
	}

}
