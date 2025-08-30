package Day_18;

//How to perform single task by multiple threads in java 
public class demo15  extends Thread{
public void run() {
	System.out.println("task one");
}
     public static void main(String args[]) {
    	 demo15 t1 = new demo15();
    	 demo15 t2 = new demo15();
    	 demo15 t3 = new demo15();

    	 
    	 t1.start();
    	 t2.start();
    	 t3.start();
     }
}
