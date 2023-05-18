public class NormalAccount extends Account{
  private int balance;
  private final int NORMAL_ACCOUNT_MAXIMUM_BALANCE = 10000000; // 천만원 이상일 시 출금 불가

  public NormalAccount(String accountNumber, String name, int balance) {
    super(accountNumber, name, balance);
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public void deposit(int deposit) {
    if (deposit <= 0) {
      System.out.println("입금 금액은 0보다 커야합니다");
      return;
    }
    
    this.balance += balance;
  }

  public void withdraw(int withdraw) {
    if (withdraw > this.balance) {
      System.out.println("잔액이 부족합니다");
      return;
    }
    if (withdraw <= 0) {
      System.out.println("출금 금액은 0보다 커야합니다");
      return;
    }
    if (withdraw > NORMAL_ACCOUNT_MAXIMUM_BALANCE)  {
      System.out.println("일반계좌는 최대 1000만원까지 출금이 가능합니다.");
      return;
    }
    balance -= withdraw;
    System.out.println("금액 :" +withdraw+" 가 출금되었습니다");
  }
}
