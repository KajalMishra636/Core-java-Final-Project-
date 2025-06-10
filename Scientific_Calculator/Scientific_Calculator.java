package Scientific_Calculator;

import java.util.Scanner;

public class Scientific_Calculator {

    private Scanner scanner;

    // Constructor: Initializes the scanner and displays a welcome message
    public Scientific_Calculator() {
        scanner = new Scanner(System.in); // Scanner to take user input
        System.out.println("\n----------------------------------------------------------------");
        System.out.println("\t\t\t Scientific Calculator");
        System.out.println("----------------------------------------------------------------\n");
    }

    // Displays the menu of operations to the user
    public void displayMenu() {
        System.out.println("\nPlease select an operation:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Square Root (√)");
        System.out.println("6. Power (x^y)");
        System.out.println("7. Sine (sin)");
        System.out.println("8. Cosine (cos)");
        System.out.println("9. Tangent (tan)");
        System.out.println("10. Logarithm (log base 10)");
        System.out.println("11. Natural Logarithm (ln)");
        System.out.println("12. Factorial (!)");
        System.out.println("13. Exponential (e^x)");
        System.out.println("14. Absolute Value (|x|)");
        System.out.println("15. Exit");
        System.out.println("----------------------------------------------------------------");
    }

    // Method to get double input from the user with prompt
    public double getDoubleInput(String prompt) {
        return getInput(prompt, true);
    }

    // Method to get integer input from the user with prompt
    public int getIntInput(String prompt) {
        return (int) getInput(prompt, false);
    }

    // Generic method to handle input validation and reading
    private double getInput(String prompt, boolean isDouble) {
        double num;
        while (true) {
            System.out.print(prompt); // Display the prompt
            // Check input validity based on type
            if (isDouble ? scanner.hasNextDouble() : scanner.hasNextInt()) {
                num = isDouble ? scanner.nextDouble() : scanner.nextInt(); // Read the input
                scanner.nextLine(); // Clear the buffer
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid " + (isDouble ? "number" : "integer") + ".\n");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return num;
    }

    // Arithmetic operations
    public double add(double a, double b) {
        return a + b; // Addition
    }

    public double subtract(double a, double b) {
        return a - b; // Subtraction
    }

    public double multiply(double a, double b) {
        return a * b; // Multiplication
    }

    public double divide(double a, double b) {
        // Check for division by zero
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return Double.NaN; // Return Not-a-Number
        }
        return a / b;
    }

    // Scientific operations
    public double sqrt(double a) {
        // Check for negative input
        if (a < 0) {
            System.out.println("Error: Cannot compute square root of a negative number.");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b); // a raised to the power b
    }

    public double sine(double degrees) {
        return Math.sin(Math.toRadians(degrees)); // Convert degrees to radians and compute sine
    }

    public double cosine(double degrees) {
        return Math.cos(Math.toRadians(degrees)); // Convert degrees to radians and compute cosine
    }

    public double tangent(double degrees) {
        return Math.tan(Math.toRadians(degrees)); // Convert degrees to radians and compute tangent
    }

    public double logarithm(double a) {
        // Check for invalid input
        if (a <= 0) {
            System.out.println("Error: Logarithm undefined for zero or negative values.");
            return Double.NaN;
        }
        return Math.log10(a); // Base 10 logarithm
    }

    public double naturalLog(double a) {
        // Check for invalid input
        if (a <= 0) {
            System.out.println("Error: Natural logarithm undefined for zero or negative values.");
            return Double.NaN;
        }
        return Math.log(a); // Natural logarithm
    }

    // Factorial function
    public double factorial(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return Double.NaN;
        }
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply numbers from 1 to n
        }
        return result;
    }

    // Exponential function
    public double exponential(double x) {
        return Math.exp(x); // Compute e^x
    }

    // Absolute value
    public double absoluteValue(double x) {
        return Math.abs(x);
    }

    // Main run loop
    public void run() {
        boolean running = true;
        while (running) {
            displayMenu(); // Show menu
            int choice = getIntInput("Enter your choice (1-15): "); // Get user choice

            double num1, num2, result; // For general use
            switch (choice) {
                case 1:
                    num1 = getDoubleInput("Enter first number: ");
                    num2 = getDoubleInput("Enter second number: ");
                    result = add(num1, num2);
                    displayResult(num1, num2, result, "+");
                    break;
                case 2:
                    num1 = getDoubleInput("Enter first number: ");
                    num2 = getDoubleInput("Enter second number: ");
                    result = subtract(num1, num2);
                    displayResult(num1, num2, result, "-");
                    break;
                case 3:
                    num1 = getDoubleInput("Enter first number: ");
                    num2 = getDoubleInput("Enter second number: ");
                    result = multiply(num1, num2);
                    displayResult(num1, num2, result, "*");
                    break;
                case 4:
                    num1 = getDoubleInput("Enter numerator: ");
                    num2 = getDoubleInput("Enter denominator: ");
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        displayResult(num1, num2, result, "/");
                    }
                    break;
                case 5:
                    num1 = getDoubleInput("Enter a number: ");
                    result = sqrt(num1);
                    if (!Double.isNaN(result)) {
                        System.out.printf("√%f = %f\n\n", num1, result);
                    }
                    break;
                case 6:
                    num1 = getDoubleInput("Enter the base number: ");
                    num2 = getDoubleInput("Enter the exponent: ");
                    result = power(num1, num2);
                    System.out.printf("%f ^ %f = %f\n\n", num1, num2, result);
                    break;
                case 7:
                    num1 = getDoubleInput("Enter angle in degrees: ");
                    result = sine(num1);
                    System.out.printf("sin(%f°) = %f\n\n", num1, result);
                    break;
                case 8:
                    num1 = getDoubleInput("Enter angle in degrees: ");
                    result = cosine(num1);
                    System.out.printf("cos(%f°) = %f\n\n", num1, result);
                    break;
                case 9:
                    num1 = getDoubleInput("Enter angle in degrees: ");
                    result = tangent(num1);
                    System.out.printf("tan(%f°) = %f\n\n", num1, result);
                    break;
                case 10:
                    num1 = getDoubleInput("Enter a number: ");
                    result = logarithm(num1);
                    if (!Double.isNaN(result)) {
                        System.out.printf("log10(%f) = %f\n\n", num1, result);
                    }
                    break;
                case 11:
                    num1 = getDoubleInput("Enter a number: ");
                    result = naturalLog(num1);
                    if (!Double.isNaN(result)) {
                        System.out.printf("ln(%f) = %f\n\n", num1, result);
                    }
                    break;
                case 12:
                    int n = getIntInput("Enter a non-negative integer: ");
                    result = factorial(n);
                    if (!Double.isNaN(result)) {
                        System.out.printf("%d! = %f\n\n", n, result);
                    }
                    break;
                case 13:
                    num1 = getDoubleInput("Enter the exponent: ");
                    result = exponential(num1);
                    System.out.printf("e^%f = %f\n\n", num1, result);
                    break;
                case 14:
                    num1 = getDoubleInput("Enter a number: ");
                    result = absoluteValue(num1);
                    System.out.printf("|%f| = %f\n\n", num1, result);
                    break;
                case 15:
                    // Exit the program
                    System.out.println("\nThank you for using the Scientific Calculator. Goodbye!\n");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 15.\n");
            }

            // Ask user if they want to continue if they didn't choose Exit
            if (choice != 15) {
                String continueChoice = getContinueChoice();
                if (continueChoice.equalsIgnoreCase("N")) {
                    System.out.println("\nThank you for using the Scientific Calculator. Goodbye!\n");
                    running = false;
                }
            }
        }
        scanner.close(); // Close the scanner after use
    }

    // Displays result in formatted way for arithmetic operations
    private void displayResult(double num1, double num2, double result, String operator) {
        System.out.printf("%f %s %f = %f\n\n", num1, operator, num2, result);
    }

    // Prompts user whether to continue or exit
    private String getContinueChoice() {
        System.out.print("Do you want to perform another operation? (Y/N): ");
        return scanner.nextLine();
    }

    // Main method - Entry point of the program
    public static void main(String[] args) {
        Scientific_Calculator calculator = new Scientific_Calculator(); // Create instance
        calculator.run(); // Run the calculator
    }
}
