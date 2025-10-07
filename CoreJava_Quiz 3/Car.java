/*
 Class & Object:
1. Write a Java program to create a Car class with attributes brand, color, and price.
Create two objects and display their details using a method displayInfo().
 * */

package Quiz_3;
       
public class Car {
	String brand;
	String color;
	String price;
	
	//Default Constructor
	public Car() {}
	
	//Parameterized constructor
	public Car(String brand, String color, String price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		
	}
	
      // Method to display info 
	  public void displayInfo() {
		  System.out.println("Brand : " + brand  +", Color :" + color  +", Price: $" + price);
	  
	  }
	public static void main(String[] args) {
		Car car1 = new Car("Toyota" ,"Black", 25000.0);
		Car car2 = new Car("Thar", "Red",40000.0 );
		
		car1.displayInfo();
		car2.displayInfo();

	
	}

}
