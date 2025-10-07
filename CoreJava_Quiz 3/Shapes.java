/*Abstraction:
5. Create an abstract class Shape with abstract method calculateArea().
Extend this class into Circle and Rectangle, implement the method and display area for each.
*/
package Quiz_3;

public class Shapes {

	// Abstract class Shape
	abstract class Shape {
	    // Abstract method to calculate area
	    public abstract double calculateArea();
	}

	// Circle class extending Shape
	class Circle extends Shape {
	    private double radius;
	    
	    // Constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    
	    // Implementation of calculateArea for Circle
	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}

	// Rectangle class extending Shape
	class Rectangle extends Shape {
	    private double length;
	    private double width;
	    
	    // Constructor
	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }
	    
	    // Implementation of calculateArea for Rectangle
	    @Override
	    public double calculateArea() {
	        return length * width;
	    }
	}

	// Main class to demonstrate and display areas
	public class Main {
	    public static void main(String[] args) {
	        // Create Circle object
	        Circle circle = new Circle(5.0);
	        
	        // Create Rectangle object
	        Rectangle rectangle = new Rectangle(4.0, 6.0);
	        
	        // Display areas
	        System.out.println("Area of Circle (radius = 5.0): " + circle.calculateArea());
	        System.out.println("Area of Rectangle (length = 4.0, width = 6.0): " + rectangle.calculateArea());
	    }
	}

}
	          
