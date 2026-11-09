package chap14;

public class ThreadStateDemo {

	public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        });

        System.out.println("생성 직후: " + t.getState());

        t.start();

        System.out.println("start() 후: " + t.getState());

        Thread.sleep(5);
        System.out.println("sleep() 중: " + t.getState());

        t.join();

        System.out.println("종료 후: " + t.getState());
    }
}
