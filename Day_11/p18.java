package Day_11;
/*
 this keyword   -->
 
 the this keyword is  refers to the current class object 
 it's to eliminate confusion between class attributes and parameters,
 or to call another constructor or method from the current object
 */

//example 1: to refer current class instance variable 
class Student2 {
	int id;
	String name ;
	
	Student2 (int id, String name){
		this.id = id;
		this.name = name;
		
	}
	
void display() {
	System.out.println(id +  "" + name);
}
}


public class p18 {

	public static void main(String[] args) {
		Student2 stu = new Student2(1 , "Kavya");
		stu.display();

	}

}
