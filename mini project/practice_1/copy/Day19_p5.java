package practice_1.copy;

/*
 1. Railway Reservation System
 
 Java-based railway application are designed top manage train schedules, ticket booking , and passenger details, leveraging 
 Java collections for efficient data management and object - oriented programming (OPP) 
 principles for modular and scalable design.
 
 Features and Modules: 
 
 1. **Train Schedule Management** :
 - Maintain a schedule of train with details such as train ID, name ,
 source, destination, timing , and availability of seats 
 -Use Java collections (e.g , HashMap, ArrayList) to store and manage 
 train schedules
 -Implement method to add , update, or remove train details 
 
 2. ** Passenger Accounts and Authentication**:
 -Enable passenger registration and secure login functionality.
 -Maintain passenger profits with personal details , travel history , and preferences 
 -Implement role-based access control for passenger and administrators.
 
 3. **Ticket Booking and Cancellation** :
 - Allow passenger to book, update , or cancel tickets.
 - Use collection like HasMap or LinkedHashMap to store booking details
   with passenger information, train details, and seat numbers.\
 - Calculate ticket5 fare dynamically based on travel distance and Class.
 
 4. **Train Search and Availability** :
 - Allow users to search trains by source, destination, and travel date .
 - Display available trains with seat availability and fare details
 - Use efficient search algorithms for a responsive user experience.
 
 5. ** Payment Processing ** : 
  - Provide tools for administrators to manage train schedules , bookings, and and passenger details.
  - Generate reports on booking treads , revenue and  trains utilization.
  - Monitor application performance and resolve issues.
  
  Technology Stack :
  - Core Java 
  - OOP Concepts 
  - Collection Framework
  - Java Built-In-Methods
  
  Example Implement Steps:
  -Step 1: Design the database scheme with tables like Trains, Passengers, Bookings, and Payments.
  -Step 2: Implement user authentication and session management .
  -Step 3: Build train schedule and ticket booking features using collections.
  -Step 4: Add payment integration and admin tools.
  -Step 5: Implement search, availability check, and reporting functionalities.
  
   Scalability and Security :
   - Use multithreading to handle concurrent users and high traffics 
   - Secure sensitive data like user passwords and payment information with encryption 
   - Employ input validation and error handling to prevent vulnerability
   
   Objective:
   To Develop a robust, secure , and user- friendly railway reservation system that streamlines ticket booking while providing efficient tools for administrators
   to manage operations
  
 */

import java.util.*;


//Represents a train with schedule and fare information
class Train {
	private String trainId;   // Unique ID of the train
    private String name;       // Name of the train
    private String source;     // Departure station
    private String destination;// Arrival station
    private String timing;     // Departure time
    private int availableSeats; // Remaining seats
    private double baseFare; // Base fare used for fare calculation  
    
    // Constructor to initialize Train object
    //Constructs a new Train instance.
    public Train(String trainId, String name, String source, String destination, String timing, int availableSeats, double baseFare) {
        this.trainId = trainId;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.timing = timing;
        this.availableSeats = availableSeats;
        this.baseFare = baseFare;
    }
    
 // Getters omitted...

    /*
     * Decrease available seats by one if there are seats left.
     * Otherwise, print a warning.
     */
    
    // Getters for train properties (read-only access)
    public String getTrainId() {
    	return trainId;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getSource() {
    	return source;
    }
    
    public String getDestination() {
    	return destination;
    }
    
    public String getTiming() {
    	return timing;
    	
    }
    
    public int getAvailableSeats() 
    {
    	return availableSeats;
    }
    
    public double getBaseFare() {
    	return baseFare;
    }
    /*
     * Decrease available seats by one if there are seats left.
     * Otherwise, print a warning.
     */
   
    
    //Method to cancel a seat booking , increase availableSeats by 1 
    public void bookSeat() {
    	if (availableSeats > 0) {
    		availableSeats--;
    	} else {
    		System.out.println("No seats available.");
    	}
    }
    
    //Method to cancel a seat booking , increase availableSeats by 1
    public void cancleSeat() {
    	availableSeats++;
    }
    
    //Override toString to display train information in readable format
    @Override 
    public String toString() {
    	return "Train ID:" + trainId + ", Name: " + name + " ,Source: " +source+" ,Destination: " + destination + ", Timing: " + timing + ", Available Seats: " +availableSeats + " , Base Fare: " +baseFare;
    }
}

//Class representing a Passenger with personal details and booking history 
class Passenger {
	private String name;               // Passenger's full name
	private String email;              // Unique email used as login ID
	private String password;           // Password for authentication (plaintext here for simplicity)
	private List<Booking> bookings;    // List of bookings made by the passenger

	//Constructor to initialize passenger details and empty booking list 
	public Passenger(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.bookings = new ArrayList<>();
	}
	
	//Getter for email (used as identifier)
	public String getEmail() {
		return email;
	}
	
	//Method to validate password during login 
	public boolean validatePassword(String password) {
		return this.password.equals(password);
	}
	
	//Add a booking to the passenger's booking list 
	public void addBooking(Booking booking) {
		bookings.add(booking);
	}
	
	//Get all booking made by the passenger
	public List<Booking> getBookings() {
		return bookings;
		
	}
	
	//Getter for passenge's name 
	public String getName() {
		return name;
	}
}

//Class representing a Booking made by a passenger on a train 
class Booking {
	 Train train;                // Train on which booking is made
	    private Passenger passenger; // Passenger who made the booking
	    private String seatNumber;   // Seat number assigned
	    private double fare;         // Fare charged for the booking
	    
	    //cONSTRUCTOR TO INITIALIZE booking details 
	    public Booking(Train train, Passenger passenger, String seatNumber, double fare) {
	    	this.train = train;
	    	this.passenger = passenger;
	    	this.seatNumber = seatNumber;
	    	this.fare = fare;
	    	
	    }
	    
	    //Getter for fare amount 
	    public double getFare() {
	    	return fare;
	    }
	    
	    //Override toString to display details 
	    @Override 
	    public String toString() {
	    	return "Booking [Train: "+train.getName() + " , Passenger: " + passenger.getEmail() + ", Seat: " + seatNumber + ", Fare: "+ fare +"]";
	    	
	    }
}

//Class representing Payment transaction for ticket booking 
class Payment {
	private String paymentId;     // Unique payment transaction ID
	private double amount;           // Amount paid
	private String paymentMethod;   //. Payment method used (Credit Card, Wallets , etc
	private boolean status ;        //Payment status : true if successful , false other wise
	
	//Constructor to initialize payment details , default status is failure (false)
	public Payment (String paymnetId, double amount, String paymentMethod) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentMethod = paymentId;
		this.status = false;
	}
	
	//Simulate payment processing and mark status as successful
	public void processPayment() {
		  // In real system, integrate with payment gateway APIs here
		this.status = true;  // Assume payment is successful for simulation
		System.out.println("Payment of " + amount + "processed successfully using"+ paymentMethod);
		
	}
	
	//Check if payment was successful
	public boolean isSuccessful() {
		return status;
	}
}

//Main system class managing trains , passenger, and bookings
class RailwayReservationSystem {
	private Map<String, Train> trains;    // Map of trainId to Train objects for quick lookup
	private Map<String, Passenger> passengers;  // Map of email to Passenger objects
	private List<Booking> bookingHistory;   // List of all bookings made in the system
	
	
	//Constructor initializes empty collections
	public RailwayReservationSystem() {
		trains = new HashMap<>();
		passengers = new HashMap<>();
		bookingHistory = new ArrayList<>();
	}

   //Add a new train to the system 
	public void addTrain(Train train) {
		trains.put(train.getTrainId(),train);
		
	}
	
	//Register a new passenger .
	public void registerPassenger(Passenger passenger) {
		passengers.put(passenger.getEmail(), passenger);
		
	}
	
	//Search for a train by source and destination (case- insensitive)
	 public Train searchTrain(String source, String destination) {	
		 for (Train train : trains.values()) {
	            if (train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)) {
	                return train;
	            }
	        }
	        return null; // No matching train found
	    }
	 
	 // Book a ticket for a passenger on a specific train and seat number
	 public Booking bookTicket(String email, String trainId, String seatNumber) {
		 Passenger passenger = passengers.get(email);
		 Train train = trains.get(trainId);
		// Check if passenger and train exist and seats are available
		 if (passenger != null && train != null && train.getAvailableSeats() > 0) {
			 double fare = calculateFare(train);   // Calculate fare dynamically
			 train.bookSeat();
			 Booking booking = new Booking(train, passenger, seatNumber, fare);
			 passenger.addBooking(booking);
			 bookingHistory.add(booking);
			 return booking;
			 
		 }
		 System.out.println("Booking failed: Invalid passenger or train, or no available seats.");
	     return null;
	 }
	 // Calculate fare for a train ticket (simple example with fixed multiplier)
	 private double calculateFare(Train train) {
		// In real system, fare depends on distance, class, dynamic pricing, etc.
		 return train.getBaseFare() * 1.2; //Example : 20% markup on base fare
		 
	 }
	 
	 //Cancel a ticket booking for a passenger
	 public void cancleTicket(String email, Booking booking) {
		 Passenger passenger = passengers.get(email);
		 // Remove booking from passenger's list and increase train seat availability
		 if (passenger != null && passenger.getBookings().remove(booking)) {
			 booking.train.cancleSeat();
			 System.out.println("Booking cancelled: " + booking);
			 
		 }else {
			 System.out.println("Booking not found.");
		 }
	
		 
	 }
	 
	 
	 //Display all trains in the system
	 public void displayTrains() {
		 for (Train train : trains.values()) {
			 System.out.println(train);
		 }
	 }
	  // Display all booking history in the system
	 public void displayBookingHistory() {
		  System.out.println("Booking History:");
		 for(Booking booking : bookingHistory) {
		 System.out.println(booking);
		 }
		 
	 }
	// View all bookings made by a specific passenger
	 public void viewPassengerBookings(String email) {
		 Passenger passenger = passengers.get(email);
		 if (passenger != null) {
			 System.out.println("Bookings for " + passenger.getName() + ":");
			 for (Booking booking : passenger.getBookings()) {
				 System.out.println(booking);
			 }
		 } else {
			 System.out.println("Passenger not found");
		 }
		 
	 }
}

//Admin class to manage system operations like adding trains and viewing trains
class Admin {
	private RailwayReservationSystem system;   // Reference to the main system
	
	// Constructor to initialize admin with system reference
	public Admin(RailwayReservationSystem system) {
		this.system = system;
	}
	
	// Add a new train to the system via admin interface
	 public void addTrain(String trainId, String name, String source, String destination, String timing, int availableSeats, double baseFare) {
	        Train train = new Train(trainId, name, source, destination, timing, availableSeats, baseFare);
	        system.addTrain(train);
	        System.out.println("Train added: " + train);
	    }
	 
	// View all trains available in the system
	 public void viewAllTrains() {
		 System.out.println("Available Trains:");
		 system.displayTrains();
	 }
}


//Main class to demonstrate the railway reservation system functionality

public class Day19_p5 {

	public static void main(String[] args) {
		 RailwayReservationSystem railwaySystem = new RailwayReservationSystem();
	        Admin admin = new Admin(railwaySystem);
	        
	        //Adding realistic Indian trains via admin
	        admin.addTrain("T001", "Rajdhani Express", "New Delhi", "Mumbai", "17:10", 200, 1500.00);
	        admin.addTrain("T002", "Shatabdi Express", "New Delhi", "Amritsar", "15:00", 150, 800.00);
	        admin.addTrain("T003", "Duronto Express", "Kolkata", "Delhi", "20:00", 180, 1200.00);
	        admin.addTrain("T004", "Nizamuddin Express", "Hyderabad", "Delhi", "22:00", 120, 1000.00);
	        admin.addTrain("T005", "Konkan Kanya Express", "Mumbai", "Kochi", "06:00", 100, 900.00);
	        admin.addTrain("T006", "Jan Shatabdi", "Lucknow", "Kanpur", "08:00", 80, 600.00);
	
	        // Registering passengers with their details
	        Passenger passenger1 = new Passenger("Rahul Sharma", "rahul@example.com", "password123");
	        railwaySystem.registerPassenger(passenger1);
	        Passenger passenger2 = new Passenger("Anjali Verma", "anjali@example.com", "password456");
	        railwaySystem.registerPassenger(passenger2);
	        
	        // Searching for trains from New Delhi to Mumbai
	        Train foundTrain = railwaySystem.searchTrain("New Delhi", "Mumbai");
	        if (foundTrain !=null) {
	        	System.out.println("Found Train: "+ foundTrain) ;
	        	// Booking a ticket for Rahul on the found train with seat number 1A
	        	 Booking booking = railwaySystem.bookTicket("rahul@example.com", foundTrain.getTrainId(), "1A");
	        	if (booking != null) {
	        		System.out.println("Ticket booked: " + booking);
	        	}
	        }else {
	        	System.out.println("No trains found.");
	        }
	        
	        //Admin views all trains available in thje system
	        admin.viewAllTrains();
	        
	        // Display all booking history in the system
	        railwaySystem.displayBookingHistory();
	        
	        //  View bookings made by Rahul and Anjali
	        railwaySystem.viewPassengerBookings("rahul@example.com");
	        railwaySystem.viewPassengerBookings("anjali@example.com");
	        
	}

}
