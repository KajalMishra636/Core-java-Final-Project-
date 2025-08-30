package Day_11;

// A system to manage employee details using inheritance and polymorphism.

// Base class
class Employee {
    // Protected variables so subclasses can access them
    protected String name;
    protected int id;

    // Constructor to initialize name and id
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

// Derived class (subclass) extending Employee
class Manager extends Employee {
    private String department; // Extra property specific to Manager

    // Constructor to initialize name, id and department
    public Manager(String name, int id, String department) {
        super(name, id); // Call the constructor of Employee class
        this.department = department;
    }

    // Overriding the display method to include department info
    @Override
    public void display() {
        super.display(); // Call base class display method
        System.out.println("Department: " + department);
    }
}

public class p3 {

    public static void main(String[] args) {
        // Creating Employee object
        Employee emp1 = new Employee("Rahul Sharma", 101);
        System.out.println("Employee Details:");
        emp1.display(); // Calls Employee's display

        System.out.println();

        // Creating Manager object
        Manager mgr1 = new Manager("Anjali Mehta", 102, "Human Resources");
        System.out.println("Manager Details:");
        mgr1.display(); // Calls overridden display in Manager

        System.out.println();

        // Polymorphism: reference of Employee but object of Manager
        Employee emp2 = new Manager("Vikram Singh", 103, "Finance");
        System.out.println("Polymorphic Employee (Manager) Details:");
        emp2.display(); // Calls Manager's display due to runtime polymorphism
    }
}
