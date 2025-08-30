package Day_11;
 //b)  accessing parent class variable 
class Animal1 {
	String color =" White";
	
}

class Dog1 extends Animal1 {
	String color = "Black";
	
	void printColor() {
		System.out.println(super.color);  //outputs: white ;
	}
}
public class p10 {

	public static void main(String[] args) {
		Dog1 d = new Dog1() ;
		d.printColor();
		

	}

}
