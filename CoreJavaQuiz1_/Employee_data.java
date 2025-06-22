package CoreJavaQuiz1_;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private final String empId;  // unique id 
    private String name;         // employee name 
    private String department;   // department 
    private double salary;       // salary
    private String designation;  // designation 

    // constructor
    public Employee(String empId, String name, String department, double salary, String designation) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    // display the employee details 
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("==============*==============*==============*==============*");
    }

    // update salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public String getEmpId() {
        return empId;
    }
}

// Manager class extends Employee
class Manager extends Employee {
    private static final String ROLE = "Manager";
    private int teamSize;

    public Manager(String empId, String name, String department, double salary, int teamSize) {
        super(empId, name, department, salary, ROLE);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("--------------------------");
    }
}

public class EmployeeManagement {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // seed with sample data
        employees.add(new Employee("E001", "John Doe", "IT", 50000, "Developer"));
        employees.add(new Employee("E002", "Jane Smith", "HR", 45000, "HR Specialist"));
        employees.add(new Manager("M001", "Robert Johnson", "IT", 75000, 5));

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: displayAllEmployees(); break;
                case 3: searchEmployee(); break;
                case 4: updateSalary(); break;
                case 5: deleteEmployee(); break;
                case 6:
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nEmployee Management System");
        System.out.println("1. Add New Employee");
        System.out.println("2. Display All Employees");
        System.out.println("3. Search Employee by ID");
        System.out.println("4. Update Employee Salary");
        System.out.println("5. Delete Employee");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addEmployee() {
        System.out.println("\nAdd New Employee");
        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();

        for (Employee emp : employees) {
            if (emp.getEmpId().equals(empId)) {
                System.out.println("Employee with ID " + empId + " already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        if (designation.equalsIgnoreCase("Manager")) {
            System.out.print("Enter Team Size: ");
            int teamSize = scanner.nextInt();
            scanner.nextLine(); // consume newline
            employees.add(new Manager(empId, name, department, salary, teamSize));
        } else {
            employees.add(new Employee(empId, name, department, salary, designation));
        }

        System.out.println("Employee added successfully!");
    }

    private static void displayAllEmployees() {
        System.out.println("\nAll Employees:");
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee emp : employees) emp.displayDetails();
    }

    private static void searchEmployee() {
        System.out.print("\nEnter Employee ID to search: ");
        String empId = scanner.nextLine();
        for (Employee emp : employees) {
            if (emp.getEmpId().equals(empId)) {
                System.out.println("Employee Found:");
                emp.displayDetails();
                return;
            }
        }
        System.out.println("Employee with ID " + empId + " not found.");
    }

    private static void updateSalary() {
        System.out.print("\nEnter Employee ID to update salary: ");
        String empId = scanner.nextLine();
        for (Employee emp : employees) {
            if (emp.getEmpId().equals(empId)) {
                System.out.print("Enter new salary: ");
                double newSalary = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                emp.updateSalary(newSalary);
                System.out.println("Salary updated successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + empId + " not found.");
    }

    private static void deleteEmployee() {
        System.out.print("\nEnter Employee ID to delete: ");
        String empId = scanner.nextLine();
        boolean removed = employees.removeIf(emp -> emp.getEmpId().equals(empId));
        if (removed) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee with ID " + empId + " not found.");
        }
    }
}
