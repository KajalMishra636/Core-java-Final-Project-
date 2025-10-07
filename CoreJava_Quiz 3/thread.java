package Quiz_3;

public class thread {
	
	class NumberThread extends Thread {
		public void run() {
			for (int i = 1; i <= 5; i++) {
			System.out.println("Thread 1: Number " + i);
			try {
				Thread.sleep(500);
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	}
	 class  LetterThread extends Thread {
		 public void run() {
			 for (char c = 'A'; c <= 'E';  c++) {
				 System.out.println("Thread 2: Letter "+ c);
				 try {
					 Thread.sleep(500);
				 }catch (InterruptedException e) {
					 e.printStackTrace();
				 }
			 }
		 }
	 }

	public class MultithreadingDemo {
		public static void main(String[] args) {
			NumberThread numThread = new NumberThread();
			LetterThread letThread = new LetterThread();
			
			numThread.start();
			letThread.start();
		}
		

	}

}
