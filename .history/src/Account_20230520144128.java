public abstract class Account {
  public abstract int getBalance();
  public abstract void deposit(int deposit);
  public abstract void withdraw(int withdraw);
  public abstract String getAccountNumber();
  public String getAccountInfo() {
    return "계좌종류: 일반계좌, 계좌번호 :"+accountNumber+", 예금주명: " +name+ ", 잔고: "+balance;
}
}