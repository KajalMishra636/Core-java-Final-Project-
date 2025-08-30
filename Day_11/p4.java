package Day_11;

// A program to calculate the area of different shapes using polymorphism.

// Base class - Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area (must be implemented by subclasses)
    abstract double area();
}

// Derived class for Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the abstract area method for Circle
    @Override
    double area() {
        return Math.PI * radius * radius; // Area of circle = πr²
    }
}

// Derived class for Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the abstract area method for Rectangle
    @Override
    double area() {
        return length * width; // Area of rectangle = length × width
    }
}

public class p4 {

    public static void main(String[] args) {
        // Creating a Circle object
        Shape circle = new Circle(7.0); // radius = 7.0
        System.out.println("Area of Circle: " + circle.area());

        // Creating a Rectangle object
        Shape rectangle = new Rectangle(5.0, 8.0); // length = 5.0, width = 8.0
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Demonstrating polymorphism:
        // Both Circle and Rectangle are treated as Shape references
    }
}
