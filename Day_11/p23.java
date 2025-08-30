package Day_11;
    //example 2: Runtime Polymorphism
class Vehicle1 {
	void run() {
		System.out.println("Vehicle is running ");
	}
}

class Car extends Vehicle1 {
	void run() {
		System.out.println("Car is running ");
	}
}

public class p23 {

	public static void main(String[] args) {
	     Vehicle1 v = new Car() ;      //reference of superclass
	     v.run();

	}

}
