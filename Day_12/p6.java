package Day_12;

import java.util.ArrayList;
import java.util.List;

/*
 22. Event Management System
 Description :An event management system that  allows users to create 
 events. 
 register attendees ,and view event details 
 
 */
//interface for Event Operations 
interface EventOperaions {
	void createEvent(String eventName);
	void registerAttendee(String eventName,String attendeeName);
	void viewEventDetails (String eventName);
	
}

//Class representing an Events Manager 
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
