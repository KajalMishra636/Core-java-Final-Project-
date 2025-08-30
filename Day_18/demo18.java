package Day_18;


//Restaurant Simulation
public class demo18 {

	//Main class to simulate a restaurant using multithreading 
	
	//inner class to represennt a table in the resturant
	class Table {
		//Unique identifiers for each table 
		private int tableNumber;
		
		//Constructor initialize the table number 
		public Table (int tableNumber) {
			this.tableNumber = tableNumber;
		}
		
			//Method to get the table number 
			public int getTableNumber() {
				return tableNumber;
			}
		}
	
	//inner class to represent a waiter in the restaurant
	class Waiter  implements Runnable{
		//Table assigned to the waiter 
		private Table table;
		//Name of the waiter 
		private String name;
		
		//Contructor to initialize the table andname
		public Waiter (Table table,String name) {
			this.table = table;
			this.name = name;
			
		}
		
		//Method to simulate the waiter taking an order
		@Override 
		public void run() {
			//Print a message indicating the waiter is taking an order
			System.out.println(name + "is taking order fromtable "+ table.getTableNumber());
			
			try {
			    // Simulate the time it takes to take an order
			    Thread.sleep(2000);
			} catch (InterruptedException e) {
			    // If the thread is interrupted, interrupt the current thread
			    Thread.currentThread().interrupt();
			}

			// Print a message indicating the waiter has taken an order
			System.out.println(name + " has taken order from table " + table.getTableNumber());
			    }
			}

			// Main method to simulate the restaurant
			public static void main(String[] args) {
			    // Create an instance of the demo10 class
			    demo18 restaurant = new demo18();
			    
			    //Create tables
			    
			    
			    Table table1 = restaurant.new Table(1);
			    Table table2 = restaurant.new Table(2);
			    Table table3 = restaurant.new Table(3);
			    
			    //Create table 
			    Waiter waiter1 = restaurant.new Waiter(table1, "Waiter 1");
			    Waiter waiter2 = restaurant.new Waiter(table2, "Witer 2");
			    Waiter waiter3 = restaurant.new Waiter(table3, "Waiter 3");
			    
			    
			     //Create thread for each waiter 
			    Thread thread1 = new Thread(waiter1);
			    Thread thread2 = new Thread(waiter2);
			    Thread thread3 = new Thread(waiter3);
			    
			    //start the threads
			    thread1.start();
			    thread2.start();
			    thread3.start();
			    		
			}
			
			
}
	
	

	
	 

