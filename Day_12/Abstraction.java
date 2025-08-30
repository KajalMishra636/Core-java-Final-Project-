package Day_12;

/* Abstraction means hiding implementation details and showing only the essential 
 * features of an object. */

// Abstract base class
abstract class Emp {
    String name;
    int id;

    // Constructor to initialize common attributes
    Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display employee information
    void displayInfo() {
        System.out.println("Employee Name : " + name +
                           "\nEmployee ID   : " + id);
    }

    // Abstract method to be defined by subclasses
    abstract double calculateSalary();
}

// Full-time employee subclass
class FullTimeEmployee extends Emp {
    double monthlySalary;  // Fixed monthly salary

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary; // Returns fixed monthly salary
    }
}

// Part-time employee subclass
class PartTimeEmployee extends Emp {
    double hourlyRate;   // Pay rate per hour
    double hoursWorked;  // Number of hours worked

    PartTimeEmployee(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked; // Calculates salary based on hours
    }
}

// Main class to demonstrate abstraction and inheritance
public class Abstraction {
    public static void main(String[] args) {
        Emp e1 = new FullTimeEmployee("Kajal", 103, 90000.00);
        Emp e2 = new PartTimeEmployee("Tejas", 104, 200, 100);

        e1.displayInfo();  // Show details for full-time employee
        System.out.println("Salary       : " + e1.calculateSalary() + "\n");

        e2.displayInfo();  // Show details for part-time employee
        System.out.println("Salary       : " + e2.calculateSalary());
    }
}
