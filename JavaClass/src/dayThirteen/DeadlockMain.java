package dayThirteen;

public class DeadlockMain {

    public static void main(String[] args) {
        final Object resource1 = "resource1";
        final Object resource2 = "resource2";
        
        Thread thread1 = new Thread(() -> {
            synchronized(resource1) {
                System.out.println("Thread 1 resource 1 lock");
                try {Thread.sleep(100);} catch (InterruptedException e) {}
                synchronized(resource2) {
                    System.out.println("Thread 1 resource 2 lock");
                }
            }
        });
        
        Thread thread2 = new Thread(() -> {
            synchronized(resource2) {
                System.out.println("Thread 2 resource 1 lock");
                try {Thread.sleep(100);} catch (InterruptedException e) {}
                synchronized(resource1) {
                    System.out.println("Thread 2 resource 2 lock");
                }
            }
        });
        
        thread1.start();
        thread2.start();
    }

}
