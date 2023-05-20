public class StudentAccount extends Account{
  private String accountNumber;
  private String name;
  private int balance;
  private final int STUDENT_ACCOUNT_MAXIMUM_BALANCE = 30000; // 3만원 이상일 시 출금 불가

  public StudentAccount(String accountNumber, String name, int balance) {
    super(accountNumber, name, balance);
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
  }
  public void deposit(int deposit) {
    if (deposit <= 0) {
      System.out.println("입금 금액은 0보다 커야합니다");
      return;
    }
    balance += balance;
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
    if (withdraw > STUDENT_ACCOUNT_MAXIMUM_BALANCE)  {
      System.out.println("학생계좌는 최대 3만원까지 출금이 가능합니다.");
      return;
    }
    balance -= withdraw;
    System.out.println("금액 :" +withdraw+" 가 출금되었습니다");
  }

  public String getAccountInfo() {
      return "계좌종류: 학생계좌, 계좌번호 :"+accountNumber+", 예금주명: " +name+ ", 잔고: "+balance;
  }
}
