package Day_20;
/*
 8. Anonymous Inner Class : Thread Implementation 
 Problem : Create a thread Implementation inner class to print numbers.
 * */
public class P16 {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				for (int i =1; i <= 5; i++) {
					System.out.println("Number: " + i);
				}
			}
		};
		thread.start();  // output: Number : 1, Number : 2, .....

	}

}
