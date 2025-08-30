package Day_12;

// ▪️ Interface defining the 'pay' contract
interface Payment {
    void pay();  // abstract method, implicitly public
}

// ▪️ Named implementation: UPI
class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("💰 Payment via UPI");
    }
}

// ▪️ Named implementation: CreditCard
class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("💳 Payment via Credit Card");
    }
}

// ▪️ Main class demonstrating polymorphic behavior
public class Abstraction8 {
    public static void main(String[] args) {
        // Using interface reference for UPI payment
        Payment p1 = new UPI();
        p1.pay();  // Output: 💰 Payment via UPI

        // Using interface reference for CreditCard payment
        Payment p2 = new CreditCard();
        p2.pay();  // Output: 💳 Payment via Credit Card

        // Anonymous implementation (inline class)
        Payment p3 = new Payment() {
            @Override
            public void pay() {
                System.out.println("💷 Payment via Cash");
            }
        };
        p3.pay();  // Output: 💷 Payment via Cash
    }
}
