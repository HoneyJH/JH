public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        // acc.Balance = 1000;  ERROR
        acc.setBalance(1000);
        System.out.printf("잔액: %d",acc.getBalance());
    }
}

class Account {
    private int balance;

    // get 메소드
    public int getBalance() {
        return balance;
    }

    // set 메소드
    public void setBalance(int b) {
        balance = b;
    }
}