package Day_12;

// Abstract class defines the "Animal" concept
// with a placeholder for making sounds
abstract class Animal {
    // Abstract method: subclasses must provide an implementation
    abstract void sound();
}

// Concrete subclass that extends the abstract class
// and provides a specific implementation for sound()
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");  // Actual sound for a Dog
    }
}

// Main class to test abstraction and polymorphism
public class Abstraction11 {
    public static void main(String[] args) {
        // We use Animal reference to hold Dog instance
        Animal myDog = new Dog();

        // Calls the overridden method in Dog
        myDog.sound();  // Output: Dog barks
    }
}
