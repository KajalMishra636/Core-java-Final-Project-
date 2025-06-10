 import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double inputTemp, convertedTemp;
        int choice;
        
        System.out.println("\n\t ==== Temperature Converter ====");
        System.out.println("\n\tChoose converdion type:");
        System.out.println("\t1. Celsius to Fahrenheit");
        System.out.println("\t2. Faharenheit to Celcius");
        System.out.println("\tEnter your choice (1 or 2):");
	    choice = scanner.nextInt();
	     
	    if (choice == 1 ) {
	    	System.out.println("\n\tEnter temperature in Celsius: ");
	    	inputTemp = scanner.nextDouble();
	    	convertedTemp = (inputTemp * 9 / 5) + 32;
	    	System.out.printf("\t%.2f°C is equal to %.2f°F\n", inputTemp, convertedTemp);
	    	
	    } else if (choice == 2) {
            System.out.print("\n\tEnter temperature in Fahrenheit: ");
            inputTemp = scanner.nextDouble();
            convertedTemp = (inputTemp - 32) * 5 / 9;
            System.out.printf("\t%.2f°F is equal to %.2f°C\n", inputTemp, convertedTemp);
        } else {
            System.out.println("\n\tInvalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }
}
