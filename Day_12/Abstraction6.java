package Day_12;
//example 7: Interface for Banking Operations

//Defining a interface
  interface Bank {
	  void deposite();
	  void withdraw();
	  
  }
  
  //implement  the interface
  class HDFCBank implements Bank {
	  public void deposite() {
		  System.out.println("Amount deposited");
	  }
	  
	  public void withdraw() {
		  System.out.println("Amount withdrawn");
	  }
  }
  
  //main class 
  
public interface Abstraction6 {
public static void main(String[] args) {
	//creating object using interface reference 
	Bank myAmount = new HDFCBank();
	
	//calling implemented methods
	myAmount.deposite(); //output: Amount deposited
	myAmount.withdraw();  //output : Amount withdraw
}
}
