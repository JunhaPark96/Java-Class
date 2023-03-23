package dayThirteen;

import dayTwelve.Counter;

public class MultiThread {

    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        counter.setCount(0);
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                    synchronized (counter) {
                        counter.count();                        
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        Thread.sleep(50); 
        // Thread.sleep(50); 이 없으면?
        // 메인 Thread 실행 -> for문 동작 -> for문 안에 new Thread 명령 시작 -> 메인 Thread 동작 끝 -> 하지만 new Thread의 동작은 끝나지 않았기 때문에 1000까지 출력이 나오지 않는다.
        System.out.println(counter.getCount());
    }

}
