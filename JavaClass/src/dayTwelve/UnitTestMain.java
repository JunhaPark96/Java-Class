package dayTwelve;

public class UnitTestMain {

    public static void main(String[] args) {
        Account account = new Account("홍길동", 10_000);
        Account account2 = new Account("홍길", 10_000);
        
        System.out.println(account);
        
        account.transfer(account2, Integer.MAX_VALUE + 1);
        if (account2.getBalance() != 2_147_483_648L) {
            System.out.println("다름");
        }
    }

}
