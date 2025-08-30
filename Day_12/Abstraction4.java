package Day_12;

//Example 5: Partial Abstraction (Abstract class with both methods )

//Abstraction  class with both abstract and concerte method 
abstract class Appliance {
	void plugIn() {
		System.out.println("Plugging in ");
	}
	
	abstract void operate(); //abstract method 
}

//concrete class extending the abstract class
class Fan extends Appliance{
	@Override
	public void operate() {
		System.out.println("Fan is spinning ");
	}
}

public class Abstraction4 {

	public static void main(String[] args) {
	//create object using abstract class reference
		Appliance myAppliance = new Fan();
		
	 //call both method 
		myAppliance.plugIn();  //concrete method from abstract class
		myAppliance.operate();    //Implemented in subclass  

	}

}
