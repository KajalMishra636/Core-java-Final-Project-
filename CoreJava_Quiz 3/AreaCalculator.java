/* 
Polymorphism (Method Overloading):
4. Write a Java program to calculate the area of a square and a rectangle using method overloading.
*/
package Quiz_3;

public class AreaCalculator {
        //method square 
	   public double calculateArea(double side) {
		   return side * side;	 
		   }
	   
	   //Method for rectangle ( method overloading )
	   public double calculateArea(double length, double width ) {
		   return length * width;
		   
	   }
	   
	   public static void main(String[] args) {
		AreaCalculator calc = new AreaCalculator();
		System.out.println("Square area: " + calc.calculateArea(5.0));
		System.out.println("Rectangle Area: " + calc.calculateArea(4.9, 6.0));
	}
}
