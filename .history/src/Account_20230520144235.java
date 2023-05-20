public abstract class Account {

  

  public int getBalance() {
    return balance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountInfo() {
    return "계좌종류: 일반계좌, 계좌번호 :"+accountNumber+", 예금주명: " +name+ ", 잔고: "+balance;
}
public abstract void deposit(int deposit);
  public abstract void withdraw(int withdraw);
}
