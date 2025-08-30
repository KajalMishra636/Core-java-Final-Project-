package Day_11;
//example 2 : static method call
class Greeting{
	static void sayHello() {
		System.out.println("Hello from static method");
	}
}
public class p21 {

	public static void main(String[] args) {
		
	Greeting.sayHello();  //static calling 
	}
}
