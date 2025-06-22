package CoreJavaQuiz1_;
import java.util.Scanner;

public class Sci_calculator {

    static double add(double a, double b)       { return a + b; }
    static double subtract(double a, double b)  { return a - b; }
    static double multiply(double a, double b)  { return a * b; }
    static double divide(double a, double b) {
        if (b != 0) return a / b;
        System.out.println("Error: Cannot divide by zero");
        return Double.NaN;
    }
    static double modulus(double a, double b)   { return a % b; }
    static double square(double a)              { return a * a; }
    static double cube(double a)                { return a * a * a; }
    static double power(double base, double exp){ return Math.pow(base, exp); }
    static double squareRoot(double a)          { return Math.sqrt(a); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2;

        do {
            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Square");
            System.out.println("7. Cube");
            System.out.println("8. Power (a^b)");
            System.out.println("9. Square Root");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble(); num2 = sc.nextDouble();
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble(); num2 = sc.nextDouble();
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble(); num2 = sc.nextDouble();
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble(); num2 = sc.nextDouble();
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                case 5:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble(); num2 = sc.nextDouble();
                    System.out.println("Result: " + modulus(num1, num2));
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Square: " + square(num1));
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Cube: " + cube(num1));
                    break;
                case 8:
                    System.out.print("Enter base and exponent: ");
                    num1 = sc.nextDouble(); num2 = sc.nextDouble();
                    System.out.println("Power: " + power(num1, num2));
                    break;
                case 9:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Square Root: " + squareRoot(num1));
                    break;
                case 10:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 10);

        sc.close();
    }
}
