package Day_16;
//Concept 1: Basic Garbage Collection
public class p21 {
           //A simple to demonstrate garbage collection 
	static class SimpleObject {
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
		SimpleObject obj1 = new SimpleObject("Object 1");
		SimpleObject obj2 = new SimpleObject("Object 2");
	
		//nullifying references to make objects eligible for garbage collection 
        Obj1 = null;  // Object 1is now eligible for garbage collection 
        obj2 = null;  // Object 1is now eligible for garbage collection 
        
        //Suggesting JVM to run garbage collector 
        System.gc();
        
        //Print a message to indicate the end of the main method 
        System.out.println("End of main method .");
        
	}

}
