package Day_18;

//How to perform Multiple Tasks By Multiple Threads

class demo17 implements Runnable {
	public void run () {
		System.out.println("Task executed by :" + Thread.currentThread().getName());
}


	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			Thread thread = new Thread(new Thread(new demo17());
			thread.start();
		}

	}

}
