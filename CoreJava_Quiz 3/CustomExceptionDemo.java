/*
Custom Exception:
9. Write a program that throws a custom exception InvalidAgeException if a user enters an age less than 18.
*/
package Quiz_3;

import java.util.Scanner;

//Custom exception class
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class CustomExceptionDemo {
              public static void InvalidateAge(int age) throws InvalidAgeException {
	            if (age < 18) {
			        throw new InvalidAgeException("Age must be 18 or older.");
			
			
			}else {
				System.out.println("Valid age: " + age);
			}
			

	}
              
              public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter age: ");
				int age = scanner.nextInt();
				
				try {
					InvalidateAge(age);
				}catch (InvalidAgeException e) {
					System.out.println("Exception: " + e.getMessage());
				}finally {
					scanner.close();
				}
			}

}
