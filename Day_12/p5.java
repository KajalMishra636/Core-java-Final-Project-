package Day_12;

import java.util.ArrayList;
import java.util.List;


/*
 21. Social Media Platform 
 Description :A social media platform that allows lows users to create 
 to create users to create posts ,
 like them , and view their feed.
 
 */
//Interfaces for Social Media Operations 
interface SocialMediaOperations {
	void createPost(String content);  //create a new post with the given  content 
	void likePost(int postId);     //Like a post based on its ID 
	void viewFeed();               // View all posts in the feed
}


//class implementing the social media platform functionality
//Class for social media operations  
 class SocialMediaPlatform implements  SocialMediaOperations {
	 
//list to store all the posts created 	 
 
     private List<Post> posts = new ArrayList<>();
     //counter to assign unique IDs to each post
     
	 private int postIdCounter = 0;
	 
	 //Inner class representing a single post 
	 private class Post {
		 int id;                  //unique ID of the post 
		 String content;         //The post's text/content
		 int likes;              //Number of like the post has received
		 
		 
		 //Constructor initialized the post with content , unique ID, and  zero likes
		 
		 
		 Post(String content) {    // from the sting content 
			 this.id = postIdCounter++;
			 this.content = content;
			 this.likes = 0;
			 
		 }
	 }
	 
	 //create a new post and add it to the list 
	 
	 @Override
	 public void createPost(String content) {
		 posts.add(new Post (content));
		 System.out.println("Created post: " + content);    //Confirmation message 
	 }
	 
	 //like a post by its ID , increment its like count  
	 
	 @Override 
	 public void likePost(int postId) {
		 for (Post post : posts) {
			 if (post.id == postId) {
				 post.likes++;
				 System.out.println("Liked post: " + postId);
				 return;
			 }
		 }
		 //if no matching post if found 
		 System.out.println("Post not found.");
	 }
	 
	 //Display all posts their IDs, content ,and like counts
	 
	 @Override
	 public void viewFeed() {
		 System.out.println("Feed:");
		 for (Post post : posts) {
			 System.out.println("Post ID: " + post.id + ", Content :" + post.content  + ", Likes: " + post.likes);
			 
		 }
	 }
 }
 
 //Main class to test the Social Media Platform 
public class p5 {
	public static void main(String[] args) {
		//Create a platform instance 
          SocialMediaPlatform  platform = new SocialMediaPlatform();
          
          platform.createPost("Hello World ! ");   //Post ID = 0
          platform.createPost("Java is awesome!"); //Post ID =1
          
          //like the first post (ID =0)
          platform.likePost(0);
          
          //Display the feed to the console 
          platform.viewFeed();
          
          
	}

}
