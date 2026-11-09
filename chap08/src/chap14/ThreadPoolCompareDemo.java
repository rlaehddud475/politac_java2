package chap14;
import java.util.concurrent.*;
public class ThreadPoolCompareDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("실행 중: " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        System.out.println("========== [FixedThreadPool] ==========");
        ExecutorService fixed = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            fixed.submit(task);
        }
        fixed.shutdown();
        while (!fixed.isTerminated()) {
        }
        System.out.println(">>> FixedThreadPool 작업 완료\n");

        System.out.println("========== [CachedThreadPool] ==========");
        ExecutorService cached = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            cached.submit(task);
        }
        cached.shutdown();
        while (!cached.isTerminated()) {
        }
        System.out.println(">>> CachedThreadPool 작업 완료\n");

        System.out.println("*** 모든 스레드 작업 종료 ***");
    }
}