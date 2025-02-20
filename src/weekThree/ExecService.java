package weekThree;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecService {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);

		Future<Integer> f1 = service.submit(new Task1());
		Future<Integer> f2 = service.submit(new Task2());
		Future<Integer> f3 = service.submit(new Task3());
		try {

			System.out.println(f1.get());
			System.out.println(f2.get());
			System.out.println(f3.get());

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	static class Task1 implements Callable<Integer> {

		@Override
		public Integer call() throws InterruptedException {
			Thread.sleep(1000);
			System.out.println("Task 1");
			return 1;

		}

	}

	static class Task2 implements Callable<Integer> {

		@Override
		public Integer call() throws InterruptedException {
			Thread.sleep(500);
			System.out.println("Task 2");
			return 2;

		}

	}

	static class Task3 implements Callable<Integer> {

		@Override
		public Integer call() throws InterruptedException {
			Thread.sleep(2000);
			System.out.println("Task 3");
			return 3;

		}

	}

}
