public abstract class Account {
  protected String accountNumber;

  public abstract int getBalance();
  public abstract void deposit(int deposit);
  public abstract void withdraw(int withdraw);

  public abstract String getAccountNumber();
  public abstract String getAccountInfo();

}
