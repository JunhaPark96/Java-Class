package dayTwelve;

import static org.junit.Assert.*;
import org.junit.*;

public class UnitTestMainTest {

    @Test
    public void 생성자_test() {
        Account account = new Account("홍길동", 10_000);
        assertEquals("홍길동", account.getOwner());
        assertEquals(20000, account.getBalance());
        
    }
    
    @Test
    public void transfer_Test() {
        Account account1 = new Account("홍길동", 30000);
        Account account2 = new Account("한석봉", 0);
        
        account1.transfer(account2, 10000);
        assertEquals(20000, account1.getBalance());
        assertEquals(10000, account2.getBalance());

        Account account3 = new Account("한석봉", 0);
        account3.transfer(account1, 10000);
        assertEquals(30000, account1.getBalance());
        assertEquals(0, account3.getBalance());
        
    }

}
