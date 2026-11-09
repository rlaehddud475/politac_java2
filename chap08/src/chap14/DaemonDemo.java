package chap14;

public class DaemonDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                while (true) {
                    Thread.sleep(1000);
                    System.out.println("작업 스레드");
                }
            } catch (InterruptedException e) {
            }
        };

        Thread t1 = new Thread(task, "작업 스레드");
        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("메인 스레드가 끝났습니다.");
    }
}