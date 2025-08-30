package Day_12;

//example 8: Abstraction class with Constructor 

//Abstract class with constructor 
abstract class Machine {
	Machine() {
		System.out.println("Machine is created");
	}
	
	abstract void run();   //abstract method 
	
}

//concrete class existing the abstract class 
class WashingMachine extends Machine {
	@Override 
	public void run() {
		System.out.println("Washing clothes");
	}
}

//main class
public interface Abstraction7 {
  public static void main(String[] args) {
	// Create a WashingMachine object
      // This will call Machine() constructor first, then WashingMachine() implicitly
	  
	  Machine m = new WashingMachine();
	  
	  //invoke the overridden run () method 
	  m.run(); //output : Machine is created 
	           // Washing clothes 
}
}
