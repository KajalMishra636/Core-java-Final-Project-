package Day_12;
//Example 2: Abstraction Class with Normal Mehod 

//Abstraction 
abstract class Vehicle {
	//Abstract method (to be implemented by subclasses)
	
	abstract void start();
	
	//Concrete method 
	void fuelType() {
		System.out.println("Petrol or Diesel ");
	}
}

//subclass providing implementation 
class Car extends Vehicle {
	@Override
	public void start () {
		System.out.println("Car stsrts with key");
	}
}

//Main class 
public class Abstraction12 {

	public static void main(String[] args) {
	   //create object of car using vehicle reference 
		Vehicle myCar = new Car();
		
		//call both methods
		myCar.start();   //output :Car starts with key 
		myCar.fuelType();  //output: petrol or diesel
		

	}

}
