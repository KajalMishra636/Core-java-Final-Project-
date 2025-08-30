package Day_11;
/*
 *1. super keyword examples
 super is refer to used to the immediate parent class
 */

// a) calling parent class constructor 
class Animal {
	Animal() {
		System.out.println("Animal constructor ");
	}
	
}


class Dog extends Animal {
	Dog () {
		super ();
		System.out.println("Dog constructor");
	}
}
public class p1 {

	public static void main(String[] args) {
		Animal ani1 = new Dog();
	}

}
