package Day_12;
//example 10: Using Abstraction in Real-World Terms

//Abstraction class
abstract class SocialMedia {
	abstract void postContent();  //Abstract method
	
}

//Concrete class extending the abstract class 
class Instagram extends SocialMedia {
	@Override 
	public void postContent() { 
		System.out.println("Posting photos on instagram");
	}
}

//Another concrete class for variety 
class YouTube extends SocialMedia {
	@Override 
	public void postContent() {
		System.out.println("Uploading video on YouTube");
	}
}
public interface Abstraction9 {
	public static void main(String[] args) {
		  
		//using abstraction : parent reference to child object 
		SocialMedia user1 = new Instagram();
		SocialMedia user2 = new YouTube();
		
		//calling overridden method 
		user1.postContent(); //output : posting photo on Instagram
		user2.postContent(); //output : uploading video on youtube 
	}

}
