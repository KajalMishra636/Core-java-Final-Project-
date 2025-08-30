package Day_15;

public class pp1 {
	
	public static void main(String[] args) {
        //  create the string with initial content " Sachin"
	
	String str = "Sachin";
	
	// concat() returns a new String  ,but we don't store it 
	str.concat("Tendulkar");   //no effects on 'str' variable
	
	//'str' still holds "Sachin "
	System.out.println(str);
	
	//Correct approach :reassign the concatenated result 
	str = str.concat("Tendulkar");
	System.out.println(str);   //Now prints "Sachin Tendulkar"

	}

}
