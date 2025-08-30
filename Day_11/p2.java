package Day_11;
//example 3 : to invoke class constructor 
class Person {
	String name;
	int age ;
	
	Person() {
		this("Unknown", 0);  //calls parameterizzed constructor
	}
	Person (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	void info() {
		System.out.println( name +"-" +age);
	}
}
public class p2 {

	public static void main(String[] args) {
		Person p = new Person("Kajal",22);
		
		p.info();

	}

}

