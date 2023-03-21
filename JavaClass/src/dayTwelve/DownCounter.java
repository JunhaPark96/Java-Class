package dayTwelve;

public class DownCounter implements CounterInterface{
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public int count() {
        this.count--;
        return count;
    }

    public DownCounter(int count) {
        this.count = count;
    }

    
}
