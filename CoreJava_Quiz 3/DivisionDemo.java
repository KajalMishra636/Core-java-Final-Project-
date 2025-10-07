/*
 Exception Handling:
7. Write a Java program to input two numbers and perform division.
Handle ArithmeticException if the denominator is zero.

 * */

package Quiz_3;

import java.util.Scanner;

public class DivisionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numerator: ");
		int num = scanner.nextInt();
		System.out.println("Enter denominator: ");
		int den = scanner.nextInt();
		
		try {
			int result = num / den;
			System.out.println("Result: "+ result);
		}catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is allowed");
			
			}finally {
				scanner.close();
			}
		}

}
