public abstract class Account {

  private String accountNumber;
  private String name;
  private int balance;

  public Account(String accountNumber, String name, int balance) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountInfo() {
    return "계좌종류: 일반계좌, 계좌번호 :"+accountNumber+", 예금주명: " +name+ ", 잔고: "+balance;
  }
  public void deposit(int deposit) {
    if (deposit <= 0) {
      System.out.println("입금 금액은 0보다 커야합니다");
      return;
    }
    balance += deposit;
  }
  public abstract void withdraw(int withdraw);
}
