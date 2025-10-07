
/*
 Multiple Catch Blocks:
8. Write a Java program to handle multiple exceptions such as ArrayIndexOutOfBoundsException and NumberFormatException.

 * */
package Quiz_3;

import java.util.Scanner;

public class MultipleExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = 0;
        try {
        	size = Integer.parseInt(scanner.nextLine());  //May thrown NumberException
        	 int[] arr	 = new int[size];
        	System.out.println("Enter index: ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Value at index " + index +" :" + arr[index]);
        }catch (NumberFormatException e) {
        	System.out.println("Error : Invaide number format.");
        }catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println("Error: Index out of boundss. ");
        } finally {
        	scanner.close();
        }
	}

}
