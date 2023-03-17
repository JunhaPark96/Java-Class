package dayNineth;

public class BankAccount {
    private String accountNumber;
    private int balance;
    
    
    /*
     * 계좌번호를 표시하는 String 형 필드 accountNumber 와 잔액을 표시하는 int 형 필드 balance 를 가지는 은행계좌 클래스를 작성하시오. 그리고, 이 클래스에 메소드 선언을 추가해, 다음의 1.과 2.의 조건을 만족하도록 수정하시오.
    계좌번호 4649, 잔액 1592원 Account 인스턴스를 변수 a 에 생성하고 System.out.println(a); 를 실행하면, 화면에 1592원 (계좌번호=4649)) 라고 표시
    계좌번호가 같으면 값이 같은 것으로 판단할 것. 단, “  4649” 처럼 계좌번호의 앞에 공백이 있으면, 공백을 무시하고 비교할 것 (“4649”와 “  4649 ”는 같은 것으로 본다)
    (힌트 : java.lang.String 클래스의 trim() 메소드를 이용)
     */
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber.trim();
        this.balance = balance;
    }
    
    
    @Override
    public String toString() {
        return balance + "원 (계좌번호=" + accountNumber + "))";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BankAccount)) {
            return false;
        }
        BankAccount other = (BankAccount) o;
        return accountNumber.equals(other.getAccountNumber());
    }
    
    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
}
