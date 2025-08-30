package Day_11;
   //a simple online quiz system to manage questions and answers.

import java.util.Scanner; //importing scanner for user input 

//Class representing a question
//instance variables 
class Question {
	private String questionText;// the text of question 
	private String answer;    // the correct answer to the question
	
	//constructor to initialize the question and answer
	public Question(String questionText , String answer) {
		this.questionText = questionText;   //set the question text 
		this.answer = answer;   //set the correct answer 
	}
	
	
	//Method to check  if the user's answer is correct 
	public boolean checkAnswer(String userAnswer) {
		return answer.equalsIgnoreCase(userAnswer);// Comparison is not case sensitive 
	}
	
	//Method to display question 
	public void display() {
		System.out.println("Question : "+ questionText);    // Print the question text. 
	}
	
	
	//getting method to access the private answer field 
	public String getAnswer() {
		return answer;
	}
}
//main class 
public class p7 {

	public static void main(String[] args) {
		//create an instance of the Question class with a specific question and  answer
		Question question = new Question("What is the capital of France?", "Paris");
		
		//Display the question to the user
		question.display();
		
		//Initialize the scanner for user input 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your answer: "); //prompt the user for their answer
		String userAnswer = scanner.nextLine(); //Read the user's answer
		
		//check if the user's answer is correct and display the result
		if (question.checkAnswer(userAnswer)) {
			System.out.println("Correct!");  //inform the user of a correct answer
		}
		else {
			System.out.println("Wrong! The correct answer is : "+ question.getAnswer()); //inform the user of the correct answer
		}
		
		//close the scanner 
			scanner.close();
			
		}
		
		 
		 
}


