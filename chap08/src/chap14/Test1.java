package chap14;
class Worker extends Thread {
	public void run() {
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
	}
}

public class Test1 {
	public static void main(String[] args) {
		int alphabet = 'a';
		Worker worker = new Worker();
		worker.start();

		while (worker.isAlive()) {
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