package Day_11;
/* 
 what is Binding in Java? 
 
  Static  Binding (Early Binding )
  1. Method call is resolved during compilation , not at runtime.
  2. Work with private, final ,static methods
  3. Uses method overloading
  
  */

//example 1: Method Overloading
class Calculator {
	void add(int a, int b) {
		System.out.println("Sum = " + (a+ b));
	}
	
	void add(double a, double b) {
		System.out.println("Sum =  " + (a + b));
	}
}
public class p20 {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
	         obj.add(10,20);   //calls int version
             obj.add(5.6, 6.9);  //calls double version
	}

}
