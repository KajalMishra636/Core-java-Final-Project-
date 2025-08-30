package Day_11;

// Class with different access modifiers
class MyClass {
    // public variable
    public int value = 10;

    // private variable
    private int value2 = 20;

    // protected variable
    protected int value3 = 30;

    // default (package-private) variable
    int value4 = 40;

    // public method
    public void publicmethod() {
        System.out.println("I am using public access modifier");
    }

    // protected method
    protected void protectedmethod() {
        System.out.println("I am using protected access modifier");
    }

    // default method
    void defaultmethod() {
        System.out.println("I am using default access modifier");
    }

    // method to access private variable from inside the class
    public void showPrivateValue() {
        System.out.println("Accessing private value inside class: " + value2);
    }
}

// Main class to test access modifiers
public class d7 {
    public static void main(String[] args) {
        MyClass my = new MyClass(); // Creating object of MyClass

        // Accessing public variable
        System.out.println("Public value: " + my.value);

        // Accessing protected variable (accessible within same package)
        System.out.println("Protected value: " + my.value3);

        // Accessing default variable (accessible within same package)
        System.out.println("Default value: " + my.value4);

        // Can't access private variable directly here
        // System.out.println(my.value2); // ❌ Error

        // Accessing private variable through public method
        my.showPrivateValue();

        // Calling methods
        my.publicmethod();       // ✅ public
        my.protectedmethod();    // ✅ protected (accessible within same package)
        my.defaultmethod();      // ✅ default (package-private)
    }
}
