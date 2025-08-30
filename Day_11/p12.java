package Day_11;
/*
 static keyword examples
 static is used for class-level members, shred by all instances.
 */
//a) static variable 

class Student {
	static String college = "ABC College";
	int roll;

	
	Student(int roll) {
		this.roll = roll;
}

void show () {

System.out.println(roll + " "+ college);

}
}
public class  p12{
	

	public static void main(String[] args) {
		Student stu = new Student(1);
		
		stu.show();
	}
}
	
	