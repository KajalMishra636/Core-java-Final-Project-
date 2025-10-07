/*
Encapsulation:
6. Create a class Student with private variables name and marks.
Use getter and setter methods to assign and display the data.
*/

package Quiz_3;

public class Student {
        private String name;
        private int marks;
        
        
        
	public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getMarks() {
			return marks;
		}



		public void setMarks(int marks) {
			this.marks = marks;
		}

		//Method for marks display data 
		public  void display() {
			System.out.println("Name: " + name + " , Marks " + marks );
			
			
		}


	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Kajal");
		student.setMarks(80);
		student.display();

	}

}
