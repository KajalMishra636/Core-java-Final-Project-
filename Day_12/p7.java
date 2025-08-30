package Day_12;

import java.util.ArrayList;
import java.util.List;

/*
 23. Library Reservation System 
 Description :A library reservation system that allows users to reserve
 books and view their reservations.
 
 */
//interfaces for library Reservation Operations
interface LibraryReservationOperations {
	void reserveBook(String bookTitle);
	void viewReservations();
}

//class representation a library Reservation Manager
class LibraryReservationManager implements LibraryReservationOperations {
	private List<String> reservations = new ArrayList<>();
	
	@Override
	public void reserveBook(String bookTitle) {
		reservations.add(bookTitle);
		System.out.println("Reservation book:" +bookTitle);
	}
	
	@Override void view
}

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
