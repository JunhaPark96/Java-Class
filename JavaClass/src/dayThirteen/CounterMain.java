package dayThirteen;

import dayTwelve.*;

class Counter {
    private long count = 0;
    
    public void add(long i) {
        System.out.println("더하기");
        count += i;
    }
    
    public void mul(long i) {
        System.out.println("곱하기");
        count *= i;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
    
}

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        new Thread(() -> {
            synchronized (counter) {
                counter.add(10);
                System.out.println(counter.getCount());
            }
        }).start();
        
        
        new Thread(() -> {
            synchronized (counter) {
                counter.mul(10);
                System.out.println(counter.getCount());
            }
        }).start();
    }
    
    
}
