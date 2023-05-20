public class SavingsAccount extends Account{
  private String accountNumber;
  private String name;
  private int balance;
  private String expireDate;

  private final String DEPOSIT_EXPIRED_DATE = "1999"; // date 객체 쓸것

  public SavingsAccount(String accountNumber, String name, int balance, String expireDate) {
    super(accountNumber, name, balance)
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
    this.expireDate = expireDate;
  }

  public int getBalance() {
    return balance;
  }

  public void deposit(int deposit) {
    if (deposit <= 0) {
      System.out.println("입금 금액은 0보다 커야합니다");
      return;
    }
    
    balance += deposit;
  }

  public void withdraw(int withdraw) {
    if (withdraw > balance) {
      System.out.println("잔액이 부족합니다");
      return;
    }
    if (withdraw <= 0) {
      System.out.println("출금 금액은 0보다 커야합니다");
      return;
    }
    if (DEPOSIT_EXPIRED_DATE.equals(expireDate)) {
      balance -= withdraw;
      System.out.println("금액 :" +withdraw+" 가 출금되었습니다");
    }
  }
  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountInfo() {
      return "계좌종류: 적금계좌, 계좌번호 :"+accountNumber+", 예금주명: " +name+ ", 잔고: "+balance+ ", 만기일: " +expireDate;
  }
}
