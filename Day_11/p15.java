package Day_11;
/*
 *3. final keyword examples
 *final is used to create constant , prevent method overriding or inheritance.*/

//a) Final variable
class Test {
	final int MAX = 100;
	
	void display() {
		//MAX =20; //Error: cannot assign a value to final variable 
		System.out.println(MAX);
	}
}
public class p15 {

	public static void main(String[] args) {
	      Test a = new Test();
	      
	      
	      // calling method 
	      a.display();

	}

}
