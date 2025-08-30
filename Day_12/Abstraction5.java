
package Day_12;

//Example 6: Abstract Class as Blueprint
//Abstract class representing a generic employee
abstract class Employee {
 // Abstract method to be implemented by subclasses
 abstract void work();
}

//Concrete subclass providing specific implementation
class Developer extends Employee {
 @Override
 public void work() {
     System.out.println("Write code");  // Specific behavior for a Developer
 }
}

//Main class to demonstrate abstraction and polymorphism
public class Abstraction5 {
 public static void main(String[] args) {
     // Create a Developer instance using an Employee reference (polymorphism)
     Employee emp = new Developer();

     // Call the overridden method; output is resolved at runtime
     emp.work();  // Output: Write code
 }
}
