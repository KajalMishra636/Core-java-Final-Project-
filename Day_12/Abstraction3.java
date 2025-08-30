package Day_12;

//Example 4:  Abstract Class with Multiple Abstract Method 

//Abstract class 
abstract class Phone {
	abstract void call();
	abstract void message();
}

//subclass implementing all abstract methods 
 class SmartPhone extends Phone {
	 @Override
	 public void call() {
		 System.out.println("Calling...");
	 }
	 
	 @Override
	 public void message() {
		 System.out.println("Sending message...");
	 }
 }
 
 //main class 
 
public class Abstraction3 {

	public static void main(String[] args) {
		//creating object of SmartPhone using abstract class reference
		Phone myPhone = new SmartPhone();
		
		//calling methods 
		myPhone.call(); //output : CALLING 
		myPhone.message();  //output: Sending message ......

	}

}
