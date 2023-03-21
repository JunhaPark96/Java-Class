package dayTwelve;

import static org.junit.Assert.*;
import org.junit.*;

public class BankTest {

//    @Test
//    public void 생성자_test() {
//        Bank bank = new Bank();
//        bank.setName("하나");
//    }
//    
    @Test(expected = IllegalArgumentException.class)
    public void 이름설정_test() {
        Bank bank = new Bank();
            bank.setName("하나");
    }
    

}
