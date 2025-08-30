package Day_11;
//c) calling parent class method
class Animal2 {
	void eat() {
		System.out.println("Eating ...");
	}
}

class  Dog2 extends Animal2 {
	void eat() {
		System.out.println("Eating bread....");
	}
	
	void  bark() {
		super.eat();  //calls animal2's method
	}
}
public class p11 {

	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.bark();
		d.eat();

	}

}
