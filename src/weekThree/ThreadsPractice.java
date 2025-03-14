package weekThree;

import java.util.Random;

public class ThreadsPractice extends Thread {

	// Shared variable between thread1 and thread2
	private static int amount = 0;
	Random random = new Random();
	private String msgString = "";

	public ThreadsPractice(String msg) {
		msgString = msg;
	}

	public static void main(String[] args) {
		ThreadsPractice thread1 = new ThreadsPractice("Deposit");
		ThreadsPractice thread2 = new ThreadsPractice("Withdraw");
		try {
			thread1.start();
			// In order to avoid race condition, we will make sure thread 1 finishes before
			// exceuting thread 2.
			//thread1.join();
			thread2.start();
			//thread2.join();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void run() {
		synchronized(ThreadsPractice.class) {
			
		if (msgString.equals("Withdraw")) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Before withdraw iteration " + i + " -> amt: " + amount);
				amount -= 6;
				System.out.println("Thread 2: Iteration: " + i + " Total amount: " + amount + "\n");
			}
		} else if (msgString.equals("Deposit")) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Before deposit iteration " + i + " -> amt: " + amount);
				amount += 100;
				System.out.println("Thread 1: Iteration: " + i + " Total amount: " + amount + "\n");
			}
		}

		}
	}

}
