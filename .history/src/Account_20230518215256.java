public abstract class Account {
  protected String accountNumber;

  public abstract int getBalance();
  public abstract void deposit(int deposit);
  public abstract void withdraw(int withdraw);

  public String getAccountNumber() {
    return accountNumber;
  }
  public String getAccountInfo() {
    return "계좌번호 :"+accountNumber+", 예금주명: " +name+ ", 잔고: "+balance;
  }

}
