package dayTwelve;

public class Account {
    private String owner;
    private int balance;
    
    // 1원 ~ 1억까지
    // 1, 2 ~ 99_999_999, 1억 : 성공
    // 0, 1억, 1원: 실패
    public void transfer(Account dest, int amount) {
        dest.setBalance(dest.getBalance() + amount);
        balance -= amount;
    }
    
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [owner=" + owner + ", balance=" + balance + "]";
    }
    
    
}
