/*
 3. Create two classes Animal (parent) and Dog (child).
The Animal class should have a method sound().
Override this method in Dog class to print “Dog barks”.
Demonstrate inheritance.
 * */

package Quiz_3;

public class Animal {
             public void sound () {
            	 System.out.println("Animal make sound");
             }
             
             class Dog extends Animal{
            	 @Override 
            	 public void sound() {
            		 System.out.println("Dog barks");
            	 }
             }
             
             public class InheritanceDemo {
            	 public static void main(String[] args) {
            		 Animal animal = new Animal();
            		 Dog dog = new Dog();
            		 
            	 animal.sound();   // parent method 
            	 dog.sound();      // override method 
             }
	

	}

}
