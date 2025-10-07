/*
 
Constructor & Method:
2. Create a class Employee with instance variables id, name, and salary.
        Use a parameterized constructor to initialize values.
        Write a method showDetails() to print employee info.

 * */

package Quiz_3;

public class Employee {

	int id;
	String name;
	double salary;
	
	//Parameterized constructor 
	public Employee ( int id, String name, double salary) {
	         this.id= id;
	         this.name = name;
	         this.salary= salary;
	         		
}
	
	//Method to show details 
	public void  showDetails() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary : $" + salary );
		
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Sima Mishra", 50000.0);
		emp.showDetails();

	}

}
