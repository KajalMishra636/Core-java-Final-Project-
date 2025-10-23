
package com.kajal.Project;

import java.io.*;
import java.util.*;

/**
 * ====================================================
 *  @author KAJAL MISHRA 
 * 
 * STUDENT MANAGEMENT SYSTEM (ADVANCED VERSION)
 * Demonstrates:
 * - Object-Oriented Programming (OOP)
 * - Inheritance, Abstraction, Polymorphism, Encapsulation
 * - File Handling with Serialization
 * - Exception Handling
 * - Use of Java Collections Framework
 * ====================================================
 */

/**
 * Base class representing a general student.
 * Demonstrates Encapsulation and Reusability.
 */
abstract class Student implements Serializable {
    protected String id;
    protected String name;
    protected int age;
    protected char grade;
    protected String department;
    protected String email;
    protected String phoneNumber;

    public Student(String id, String name, int age, char grade, String department, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public char getGrade() { return grade; }
    public void setGrade(char grade) { this.grade = grade; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Abstract method for subclass specialization
    public abstract String getStudentType();

    @Override
    public String toString() {
        return String.format(
            "%s Student => ID: %s | Name: %s | Age: %d | Grade: %c | Dept: %s | Email: %s | Phone: %s",
            getStudentType(), id, name, age, grade, department, email, phoneNumber
        );
    }
}

/**
 * Subclass representing an Undergraduate student.
 */
class UndergraduateStudent extends Student {
    private String year; // e.g., "1st Year", "2nd Year"

    public UndergraduateStudent(String id, String name, int age, char grade,
                                String department, String email, String phoneNumber, String year) {
        super(id, name, age, grade, department, email, phoneNumber);
        this.year = year;
    }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    @Override
    public String getStudentType() { return "Undergraduate"; }

    @Override
    public String toString() {
        return super.toString() + " | Year: " + year;
    }
}

/**
 * Subclass representing a Postgraduate student.
 */
class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(String id, String name, int age, char grade,
                               String department, String email, String phoneNumber, String specialization) {
        super(id, name, age, grade, department, email, phoneNumber);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    @Override
    public String getStudentType() { return "Postgraduate"; }

    @Override
    public String toString() {
        return super.toString() + " | Specialization: " + specialization;
    }
}

/**
 * Custom exception for invalid inputs.
 */
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

/**
 * FileManager handles file operations.
 */
class FileManager {
    private static final String FILE_NAME = "student_data.txt";

    public void saveToFile(List<Student> students) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(students);
            System.out.println("✅ Data saved successfully to file.");
        } catch (IOException e) {
            System.out.println("❌ Error saving data: " + e.getMessage());
        }
    }

    public List<Student> loadFromFile() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<Student>) in.readObject();
            System.out.println("📂 Data loaded successfully from file.");
        } catch (FileNotFoundException e) {
            System.out.println("ℹ️ No previous records found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error loading data: " + e.getMessage());
        }
        return students;
    }
}

/**
 * Main program demonstrating full OOP with file handling and exception management.
 */
public class StudentManagement {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Student> students = new ArrayList<>();
    private final FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        new StudentManagement().run();
    }

    public void run() {
        students.addAll(fileManager.loadFromFile());
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("\n===== Student Management System =====");
                System.out.println("1. Add Undergraduate Student");
                System.out.println("2. Add Postgraduate Student");
                System.out.println("3. View All Students");
                System.out.println("4. Search Student by ID");
                System.out.println("5. Update Student Detail");
                System.out.println("6. Delete Student");
                System.out.println("7. Save and Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> addUndergraduate();
                    case 2 -> addPostgraduate();
                    case 3 -> viewStudents();
                    case 4 -> searchStudent();
                    case 5 -> updateStudent();
                    case 6 -> deleteStudent();
                    case 7 -> {
                        fileManager.saveToFile(students);
                        exit = true;
                    }
                    default -> throw new InvalidInputException("Invalid option! Choose between 1–7.");
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input type. Please enter numbers only.");
                scanner.nextLine();
            } catch (InvalidInputException e) {
                System.out.println("⚠️ " + e.getMessage());
            }
        }
        System.out.println("👋 Program exited successfully. Goodbye!");
    }

    // Add Undergraduate Student
    private void addUndergraduate() {
        System.out.println("Adding Undergraduate Student:");
        Student s = createStudent("Undergraduate");
        students.add(s);
        System.out.println("✅ Undergraduate student added successfully!");
    }

    // Add Postgraduate Student
    private void addPostgraduate() {
        System.out.println("Adding Postgraduate Student:");
        Student s = createStudent("Postgraduate");
        students.add(s);
        System.out.println("✅ Postgraduate student added successfully!");
    }

    // Create student dynamically
    private Student createStudent(String type) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Grade: ");
        char grade = scanner.nextLine().charAt(0);
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        if (type.equalsIgnoreCase("Undergraduate")) {
            System.out.print("Enter Academic Year (e.g., 1st Year, 2nd Year): ");
            String year = scanner.nextLine();
            return new UndergraduateStudent(id, name, age, grade, department, email, phone, year);
        } else {
            System.out.print("Enter Specialization: ");
            String specialization = scanner.nextLine();
            return new PostgraduateStudent(id, name, age, grade, department, email, phone, specialization);
        }
    }

    // View all students
    private void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("\n--- Student List ---");
        students.forEach(System.out::println);
    }

    // Search by ID
    private void searchStudent() {
        System.out.print("Enter student ID to search: ");
        String id = scanner.nextLine();
        students.stream()
                .filter(s -> s.getId().equalsIgnoreCase(id))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("❌ Student not found."));
    }

    // Update student
    private void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        String id = scanner.nextLine();
        Optional<Student> opt = students.stream().filter(s -> s.getId().equalsIgnoreCase(id)).findFirst();

        if (opt.isEmpty()) {
            System.out.println("❌ Student not found.");
            return;
        }

        Student student = opt.get();
        System.out.println("Editing record for: " + student.getName());
        System.out.print("Enter new name (leave blank to keep same): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) student.setName(name);

        System.out.print("Enter new email (leave blank to keep same): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) student.setEmail(email);

        System.out.print("Enter new phone (leave blank to keep same): ");
        String phone = scanner.nextLine();
        if (!phone.isEmpty()) student.setPhoneNumber(phone);

        System.out.println("✅ Student details updated successfully.");
    }

    // Delete student
    private void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        String id = scanner.nextLine();
        boolean removed = students.removeIf(s -> s.getId().equalsIgnoreCase(id));
        if (removed) System.out.println("🗑️ Student removed successfully.");
        else System.out.println("❌ Student not found.");
    }
}

