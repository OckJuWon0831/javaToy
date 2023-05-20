import java.time.LocalDate;

public class SavingsAccount extends Account{
  private String accountNumber;
  private String name;
  private int balance;
  private LocalDate TARGET_DATE;
  privateLocalDate CURRENT_DATE = LocalDate.now();

  public SavingsAccount(String accountNumber, String name, int balance, LocalDate targetDate) {
    super(accountNumber, name, balance);
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
    this.TARGET_DATE = targetDate;
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
    if (CURRENT_DATE.equals(TARGET_DATE)) {
      balance -= withdraw;
      System.out.println("금액 :" +withdraw+" 가 출금되었습니다");
    }
  }
  public String getAccountInfo() {
      return "계좌종류: 적금계좌, 계좌번호 :"+accountNumber+", 예금주명: " +name+ ", 잔고: "+balance+ ", 만기일: " +TARGET_DATE;
  }
}
