package Day_16;

import Day_16.p21.SimpleObject;

//Concept 1: Basic Garbage Collection with object Reference 
public class p22 {
           //A simple to demonstrate garbage collection 
	static class SimpleObject{
		String name;
		
		SimpleObject(String name ) {
			this.name = name;
			
		}
		
		//override finalize method to see when the object is garbage collected 
		@Override 
		protected void finalize() {
			System.out.println(name + " is being garbage collected ");
		}
	}
	
	
	public static void main(String[] args) {
		//creating object 
		SimpleObject obj = new SimpleObject("Object 1");
		
		//The object is still reachable so it won't garbage collected 
		System.out.println("Created: " + obj.name);
		
		//suggesting JVM to run garbage collector 
		System.gc();  //Requesting garbage collection 
		
		//The object is still reachable , so it won't be garbage collectted 
		System.out.println("After requesting garbage collection , "+ obj.name+ "is still reachable");
		
        //Now nullifying the reference 
		obj = null;  //Now the object is eligible for garbage collection 
		
		//Suggestion JVM to run garbage collector again 
		System.gc();   //Requesting garbage collection 
		
		//Printing a message to indicate the end of the main method 
		System.out.println("End of main method ");
		
	}

}
