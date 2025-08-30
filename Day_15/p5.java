package Day_15;

public class p5 {
//program 21: Reverse Each Word
	public static void main(String[] args) {
		String line = "Hello Java World";
		     for (String word : line.split(" ")) {
		    	 System.out.println(new StringBuilder(word).reverse() +" ");
		     }

	}

}
