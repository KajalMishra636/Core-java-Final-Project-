package Day_11;

//	A system to manage hotel bookings.

//class representing a hotel room
class Room{
	private int roomNumber; //stores the room number 
	private boolean isBooked; //Tracks if the room is booked (true) or available (false)
	
	//constructor  initialized a room with a given number and sets it as available 
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;  // Set the room number
		this.isBooked = false;  //All rooms start as available (not booked)
		
	}
	
	// (Method) Book the room if available 
	public void book() {
		if(!isBooked) {  //check if the room is not already booked 
			isBooked = true;   //set the room as booked
			System.out.println("Room " + roomNumber + "booked successfully.");  //Confirmation  message 
		}
			else {
				System.out.println("Room " + roomNumber + " is already booked.");//inform if already booked

			    }
			}

		
	//Method to check if the room is booked 
		public boolean isBooked() {
			return isBooked;
		}
		
		//Method to get the room number
		public int getRoomNumber() {
		     return roomNumber;  //return the room number
		}
		
	}

//Main class for the hotel booking system

public class p8 {

	public static void main(String[] args) {
           //create an array to hold 5 hotel rooms
		Room[] hotelRooms = new Room[5];
		for (int i= 0; i < hotelRooms.length; i++) {
			hotelRooms[i] = new Room(101 +i); //	Initialize rooms with numbers 101-105
		}
		
		//create a scanner object for user input using full qualified name 
		java.util.Scanner userInput = new java.util.Scanner(System.in);
		int userChoice; //Variable  to store using full qualified name 
		
		//loop to display the menu and handle user choices
		do {
			//display menu options
			System.out.println("\n=== Hotel Management System ===");
			System.out.println("1. Book a Room"); //option to book a room
			System.out.println("2. Check ROOM Status"); //option exit the system
			System.out.println("3. Exit ");  //option to exit the system
			System.out.println("Please enter your choice (1-3): ");   //prompt for user input 
			
			//get user's choice 
			userChoice = userInput.nextInt();
			
			
			switch (userChoice) {
			case 1: //Handle room number 
				System.out.println("Enter room number (101-105):");  //Prompt for room number
					int roomToBook = userInput.nextInt();  //Read the room number
					
					
					//Validation room number 
					if (roomToBook >= 101 && roomToBook <= 105 ) {
						hotelRooms[roomToBook - 101].book(); //book the specified room (adjust index)
					}else {
						System.out.println("Invalid room number! ");  //Inform if the room number is invalid
					}
					break;
					
			case 2: //Handle status check
				System.out.print("Enter room number (101-105) to check: ");   //prompt for room number
				int roomToCheck = userInput.nextInt();  //read the room number 
			
				
				//Validation room number
				if (roomToCheck >= 101 && roomToCheck <= 105) {
					//check booking status and display appropriate message
					String status = hotelRooms[roomToCheck - 101].isBooked()
							?  "BOOKED" : "AVAILABLE"; //determine status
					System.out.println("Room" + roomToCheck + "status :"+ status); //display status
				}else {
					System.out.println("Invalid room number! ");  //inform if the room number is invalid 
				}
				break;
				
				
				
			case 3: //exit the system
				System.out.println("Thank you for using our system!"); //exit message 
				break;
				
				default: //handle invalid menu choices
					System.out.println("Invalid choice ! Please select 1-3." );// inform user of invalid choice  
					
			}
		}while (userChoice != 3);  //continue until the user choose to exit 
		
		//close the scanner to prevent resource leaks
		
			userInput.close();
		}
	}


