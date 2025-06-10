import java.util.Scanner;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		// taking input
		System.out.print("Enter Student Name:  ");
		String name = scanner.nextLine();
		
		System.out.print("Enter Maths score: ");
		double math = scanner.nextDouble();
		
		System.out.print("Enter Science score: ");
		double science =scanner.nextDouble();
		
		System.out.print("Enter English score: ");
		double english = scanner.nextDouble();
		
		
		//Calculating  average 
		double average = (math + science +   english)  /3;
		
		
		//Control statement to determine grade
		String grade;
		if (average >= 90)   {
			grade ="A";
		}
		else if(average >= 75)  {
			grade ="B";
		}
		 else if(average >=60) {
			grade = "C";
		}else {
			grade = "D";
		}
		
		//Displaying result using escape sequences
		System.out.println("\n\t====== Student Grade Report =====");
		System.out.println("\tName:\t\t" + name);
		System.out.println("\tMath:\t\t" + math);
	    System.out.println("\3tScience:\t" + science);
	    System.out.println("\tEnglish:\t" + english);
		System.out.printf("\tAverage:\t%.2f\n", average);
		System.out.println("\tGrade:\t\t" + grade);
			
		}

	}


