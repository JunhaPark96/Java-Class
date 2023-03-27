package dayThirteen;

class CountUpThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 51; i++) {
            System.out.println(i);
        }
    }
    
}

public class ThreadPrac{
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new CountUpThread();
        Thread thread2 = new CountUpThread();
        Thread thread3 = new CountUpThread();
        
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
