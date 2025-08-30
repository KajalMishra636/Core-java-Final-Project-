package Day_11;

class parent1{
	int value = 10;
	parent1() {
		System.out.println("Parent class constructor ");
	}
	void display() {
		System.out.println("Display from Parent class");
	}
}

class child1 extends parent1{
	int value = 20;
	
	void displays() {
		//refers to Child's value 
		System.out.println("Value in Child class: "+ value);
		//refers to parents value 
		System.out.println("Value in Parent class : " +super.value);
	}
	
	child1() {
		super();  //calling the parents class constructor 
		System.out.println("child class constructor");
	}
	void display() {
		super.display();
		System.out.println("Display from Child class");
	}
}
public class d6 {

	public static void main(String[] args) {
		child1 child = new child1();
           child.displays();
           child.display();
           //output:
           //values in child class: 20
           //value in parent class : 10
	}

}
