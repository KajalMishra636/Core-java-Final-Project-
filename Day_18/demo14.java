package Day_18;

//class we start a thread twice 
public class demo14 extends Thread {
    public void run() {
        System.out.println("running...");
    }

    public static void main(String[] args) {
        demo14 t1 = new demo14();
        t1.start();
        t1.start(); // <-- What happens here?
    }
}
