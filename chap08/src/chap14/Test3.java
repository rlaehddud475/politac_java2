package chap14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Runnable task = () -> {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("작업 스레드 : " + i);
				try {
					Thread.sleep(980);
				} catch (InterruptedException e) {
				}
			}
			exec.shutdown();
		};
		exec.submit(task);

		int alphabet = 'a';
		while (!exec.isShutdown()) {
			System.out.println("메인 스레드 : " + (char) alphabet++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

		while (alphabet <= 'j') {
			System.out.println("메인 스레드 : " + (char) alphabet++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}

		if (Math.random() < 0.5) {
			System.out.println("메인 스레드 : k");
		}
	}
}