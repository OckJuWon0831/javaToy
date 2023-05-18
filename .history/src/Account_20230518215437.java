public abstract class Account {
  protected String accountNumber;

  public Account(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public abstract int getBalance();
  public abstract void deposit(int deposit);
  public abstract void withdraw(int withdraw);

  public String getAccountNumber() {
    return accountNumber;
  }
  public abstract String getAccountInfo();

}
