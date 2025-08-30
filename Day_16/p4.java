package Day_16;

//================================================ Encapsulation in Real-World Applications ==================================================

import java.util.ArrayList;
import java.util.List;

// =============================================== Book Class (Encapsulation Entity) =========================================================
/*
 Represent a book in the Library.
 Encapsulation details like title, author, and availability.
 */
class Book {
	private String title;
	private String  author;
	private boolean isAvailable ;
	
	//Constructor initialize book details 
	public Book (String title, String authoe) {
		this.title = title;
		this.author = author;
		this.isAvailable = true;  //By default, the book is available 
	}
	
	//Getter for title 
	public String getTitle() {
		return title;
	}
	
	//Getter for author
	
	public String getAuthor() {
	    return author;	
	}
	//Check if the book is available 
	public boolean isAvailable() {
		return isAvailable;
		
	}
	//Borrow the book (update availability) 
	public void borrow() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("You have borrowed: " + title);
			
		}else {
			System.out.println("Sorry , "+title + "is currently noy available " );
			
		}
	}
	
	//Return the book (update availability)
	public void returnBook() {
		isAvailable = true ;
		System.out.println("You have returned: "+title);
	}
}


// ====================================================== Member Class (Encapsulation Behavior) =============================================
/*
 Represent a library member 
 Manager borrowing and returning of book while hiding internal list logic 
 * */

	class  Member {
		private String name;
		private List <Book> borrowedBooks;
		
		//Constructor initializer member with a name and empty borrowed list 
		public Member(String name) {
	        this.name = name;
	        this.borrowedBooks = new ArrayList<>();
	    }


	    // Getter for member name
	    public String getName() {
	        return name;
	    }
	    
	    //Borrow a book if available and add to the member's list 
	    public void borrowBook(Book book) {
	    	if (book.isAvailable()) {
	    	  book.borrow();
	    	  borrowedBooks.add(book);
	    }else {
	    	System.out.println("Book is not available for borrowing.");
	    	
	    }
	}
	    // Return a book if it exists in the member's list
	    public void returnbook(Book book) {
	    	if (borrowedBooks.contains (book)) {
	    	    book.returnBook();
	    	    borrowedBooks.remove(book);
	    	    
	    	}else {
	    		System.out.println("You did not borrow this book.");
	    	}
	    }
	    
	    
	    //List all book currently borrowed by  this member
	    public void listBorrowedBooks() {
	    	System.out.println(name + " 's Borrowed Books: ");
	    	for (Book book: borrowedBooks) {
	    		System.out.println("- " + book.getTitle());
	    	}
	    }
	    
	    
	    /*  ============================================= Library Class (Encapsulated System)  ================================================
	    Represents the entire library 
	    Maintained the list of all the books and members and provides high - level methods 
	    */
	    
	    class Library {
	    	private List<Book> books;
	    	private List<Member> members;
	    	
	    	
	    	//Constructor initializes the library with empty lists
	    	public Library() {
	    		books = new ArrayList<>();
	    		members = new ArrayList<>();
	    	}
	    	
	    	//Add a new member to the library
	    	public void addMember(Member member) {
	    		members.add(member);
	    		System.out.println("Added member: " + member.getName());
	    	}
	    	//Display all books with their availability status 
	    	public void listBooks() {
	    		System.out.println("Library Books: ");
	    		for (Book book : books) {
	    			System.out.println("- " + book.getTitle() + " (Available : " + book.isAvailable()+ ")");
	    		}
	    	}
	    }
	    
	    
	    // =========================================Main Class to Run the Application

	    public class p4 {
	    
	    public static void main(String[] args) {
	    	//Step 1: Create a Library instances
	    	 Library library = new Library();
	    	 
	    	 //Step 2: Create Book instances
	    	 Book book1 = new Book("The Great Gatsby" , "F. Scrott Fitzgerald");
	    	 Book book2 = new Book("1984", "George Orwell");
	    	 Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
	    	 
	    	 //Step 3: Add books to the library
	    	 library.addBook(book1);
	    	 library.addBook(book2);
	    	 library.addBook(book3);
	    
	    	 
	    	 //Step 4: Create Member instances 
	    	 Member member1 = new Member("Alice");
	    	 Member member2 = new Member("Bob");
	    	 
	    	 //Step 5: Add members to  the library 
	    	 library.addMember(member1);
	    	 library.addMember(member2);
	    	 
	    	 
	    	 //Stp 6: List available books in the library 
	    	 library.listBooks();
	    	 
	    	 //Step 7: Member borrows books 
	    	 member1.borrowBook(book1);
	    	 member2.borrowBook(book2);
	    	 
	    	 //Step 8: borrowed books for each member 
	    	 member1.listBorrowedBooks();
	    	 member2.listBorrowedBooks();
	    	 
	    	 //Step 9: Try Borrowing an already borrowed book
	    	 member1.borrowBook(book1);   //Should indicate not available 
	    	 
	    	 //Step 10 : Members return books
	    	 member1.returnbook(book1);
	    	 member2.returnbook(book2);
	    	 
	    	 //Step 11 : List books again to check availibility 
	    	 
	    	 library.listBooks();
	    }
		

	}

}
