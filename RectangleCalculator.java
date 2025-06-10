import java.util.Scanner;
public class RectangleCalculator {

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in); 
	  
	  double length, width, area,perimeter;
	  
	  
	  System.out.print("\n\t==== Rectangle ====");
	  
	  //Input
	  System.out.print("\n\tEnter the length of the recangle: " );
	  length = scanner.nextDouble();
	  
	  System.out.println("\tEnter the width of the rectangle:");
	  width = scanner.nextDouble();
	  
	// Control statement to check for valid input
      if (length > 0 && width > 0) {
          // Calculations
          area = length * width;
          perimeter = 2 * (length + width);

          // Output with formatting
          System.out.printf("\n\tArea:\t\t%.2f square units\n", area);
          System.out.printf("\tPerimeter:\t%.2f units\n", perimeter);
      } else {
          System.out.println("\n\tInvalid input. Length and width must be greater than 0.");
      }

      scanner.close();
	  
	}

}
