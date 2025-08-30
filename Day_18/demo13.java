package Day_18;

// thread sleep
public class demo13 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            // the thread will sleep for the 500 milli seconds
            try {
                // delay an event for particular time slot
                Thread.sleep(2000);
            }
            
           catch (InterruptedException e) {
              
        	   
        	  System.out.println(e);
            }
           
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        // creating thread t1 and t2
        demo13 t1 = new demo13();
        demo13 t2 = new demo13();
        // start thread t1 and t2
        t1.start();
        t2.start();
    }

}
