package dayTwelve;

import static org.junit.Assert.*;
import org.junit.*;

public class CounterTest {

    @Test
    public void setCountTest() {
        Counter counter = new Counter();
        assertEquals(0, counter.getCount());
        counter.setCount(5);
        assertEquals(5, counter.getCount());
    }
    
    @Test
    public void getCountTest() {
        Counter counter = new Counter();
        counter.setCount(5);
        assertEquals(5, counter.getCount());
    }
    
    @Test
    public void incrementTset() {
        Counter counter = new Counter();
        counter.count();
        assertEquals(1, counter.getCount());
        counter.count();
        assertEquals(2, counter.getCount());
    }
    
    @Test
    public void countTset() {
        Counter counter = new Counter();
        counter.count();
        assertEquals(1, counter.getCount());
        counter.count();
        assertEquals(2, counter.getCount());
    }
}
