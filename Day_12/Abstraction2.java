package Day_12;
   
//Example 3: interfaces example (100% Abstraction)

//Interfaces with abstract method 
interface Shape {
	void draw(); //interface methods are abstract by default 
}

//implementation of the interfaces
class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

//Another implementation (for more clarity)
class Square implements Shape {
	public void draw() {
		System.out.println("Drawing Square ");
	}
}

//main class 
public class Abstraction2 {

	public static void main(String[] args) {
		//creating object using interface reference 
		
		Shape s1 = new Circle();
		s1.draw();  //output: Drawing Circle 
		
		Shape s2 = new Square();
		s2.draw();  //output: Drawing Square 
	}

}
