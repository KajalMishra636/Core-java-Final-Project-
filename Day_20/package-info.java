package Day_20;

//1. Non -Static Inner Class
class Car1 {
	private String model;
	
	//Non- static inner class 
	class Engine {
		private int horsepower;
		
		Engine(int horsepower) {
			this.horsepower = horsepower;
		}
		
		void displayInfo() {
			System.out.println("Car1 Model: " + model +
					", Engin Horsepower: " + horsepower);
		}
	}
	
	
}