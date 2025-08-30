package Day_15;

public class p16 {
  //Program 8 : Splitting Strings
	public static void main(String[] args) {
		String fruits = "apple,banana,orange";
		   String[]  arr = fruits.split(",");
		   for (String fruit : arr) {
			   System.out.println(fruit);
		   }

	}

}
