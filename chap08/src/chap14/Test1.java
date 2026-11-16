package chap14;


class Worker extends Thread {
 
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("작업 스레드: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        char alphabet = 'a';
        
        Worker worker = new Worker();
        worker.start();
        
      
         try {
            	  while (worker.isAlive()) {
                      System.out.println("메인 스레드: " + (char)alphabet++);
            
                Thread.sleep(500);
            	  }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
}
